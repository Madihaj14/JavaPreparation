package JavaPreparation.AdvPatterns;

public class AP4 {

    public static void main(String[] args) {
        //pallindromic pattern
        int n = 5;

        //outer loop
        for (int i=1; i<=n; i++){
            //innerloop
            // spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //1st half numbers
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //2nd half numbers
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
    
}
