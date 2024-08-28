package JavaPreparation.Patterns;

public class P5 {
    public static void main(String args []) {

        int n = 4;
        //half pyramid with numbers
        //outer loop
        for (int i=1; i<=n; i++) {
        //inner loop
            for (int j=1; j<=i; j++) {
                System.out.print(j);        
            }
            System.out.println();
        }
    }
}
