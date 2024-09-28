package JavaPreparation.Functions;
import java.util.*;

//que: print the given name in a function
public class Func1 {

    public static void printMyName (String name ) {
        System.out.println(name);
        return;

    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);//call kiya function ko
        sc.close ();


    }
    
}
