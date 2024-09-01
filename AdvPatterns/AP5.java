package JavaPreparation.AdvPatterns;

public class AP5 {
    public static void main(String[] args) {
        
        int n = 4;
        //outer loop, upper half
        for (int i=1; i<=n; i++) {

            //innerloop
            //spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        //lower half, outer loop
        for (int i=n; i>=1; i--) {

            //innerloop
            //spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    
}
