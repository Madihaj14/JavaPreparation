package JavaPreparation.Practice;

import java.util.Scanner;

public class Prac1 {

    public static char[][] board = new char[3][3];
    public static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        playGame();
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void playGame() {
        boolean gameEnded = false;
        while (!gameEnded) {
            playerMove();
            printBoard();
            gameEnded = checkWinner();
            if (!gameEnded) {
                switchPlayer();
            }
        }
        System.out.println("Game over!");
    }

    public static void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row = 0, col = 0;
        boolean validMove = false;

        while (!validMove) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (row < 0 || col < 0 || row > 2 || col > 2 || board[row][col] != '-') {
                System.out.println("This move is not valid");
            } else {
                validMove = true;
            }
            scanner.close();
        }

        board[row][col] = currentPlayer;
    }

    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static boolean checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }

        // Check for draw
        boolean draw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    draw = false;
                    break;
                }
            }
        }

        if (draw) {
            System.out.println("The game is a draw!");
            return true;
        }

        return false;
    }

}