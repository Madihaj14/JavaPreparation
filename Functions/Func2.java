package JavaPreparation.Functions;

import java.util.Scanner;

//Que: Make a fuction to add two numbers and return the sum
public class Func2  {
    public static int calculateSum (int a, int b) {
        int sum = a + b;
        return sum;
    } 
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println(sum);
        sc.close ();


    }
    
}
