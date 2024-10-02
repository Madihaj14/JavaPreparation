package JavaPreparation.Arrays;
import java.util.*;


public class Arr1 {
    public static void main(String args[]) {
        int[] marks = new int[3];
        marks[0] = 97; //phy
        marks[1] = 98; //chem
        marks[2] = 95; //eng
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        //array can be printed in loops
        for (int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
    }
    
}
