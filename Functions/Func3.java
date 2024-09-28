package JavaPreparation.Functions;

import java.util.Scanner;

//Que: Make a fuction to multiply two numbers and return the product
public class Func3  {
    public static int calculateProduct (int a, int b) {
        return a * b;
    } 
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of two nos. is: " + calculateProduct(a, b));
        sc.close ();


    }
    
}