
import java.util.*;

//WAP to take age as input and print whether a person is adult or not. (18+ is adult)

public class Code {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18) {
            System.out.println("Adult");
        } else {
            System.out.println("NotAdult");
        }
        sc.close();


    }
    
}