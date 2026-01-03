package JavaPreparation.Patterns;

public class P6 {
    public static void main(String args []) {

        int n = 5;
        //Inverted half pyramid with numbers in decending order
        /*
        *****
        ****
        ***
        **
        *
        */
        //outer loop
        for (int i=1; i<=n; i++) {
        //inner loop
            for (int j=5; j>=i; j-- ) {
                System.out.print(j+" ");        
            }
            System.out.println();
        }
        
        //inverted half pyramid with numbers
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}