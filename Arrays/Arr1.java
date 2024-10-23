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
    

        //array can be printed in loops(output)
        for (int i=0; i<3; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
    
}
