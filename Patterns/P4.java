package JavaPreparation.Patterns;

public class P4 {
    public static void main(String args []) {

        int n = 4;

        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop --> Space print
            for (int j=1; j<=n-1; j++){
                System.out.print(" ");
            }

            //inner loop --> Star print
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
}