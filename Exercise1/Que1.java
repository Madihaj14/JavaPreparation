package JavaPreparation.Exercise1;

public class Que1 {
    //Take 3 numbers from the user as input & make a function to print their average
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        System.out.println("The average of three numbers is: " + average(a, b, c));
    }

    // Function to calculate average of three numbers
    public static double average(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }

    

}
