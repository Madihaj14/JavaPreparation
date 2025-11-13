package JavaPreparation.Prac2;

import java.util.*;


/* Write a Program to take two numbers as input and print whether they are equal or not. 
If not, print which one is greater. */

public class Code {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Equal");
            
        } else {
            if (a>b){
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
            }
        }
        sc.close();
    }
}
