package JavaPreparation.Arrays;
import java.util.*;


public class Arr1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        // int[] marks = new int[3];
        // marks[0] = 97; //phy
        // marks[1] = 98; //chem
        // marks[2] = 95; //eng
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        //array can be printed in loops(output)
        for (int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
        sc.close();
    }
    
}
