package JavaPreparation.Exercise1;

public class Que1 {
    //Enter 3 numbers from the user & make a function to print their average
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("The average of three numbers is: " + average(a, b, c));
    }

    public static double average(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }

    

}
