/*Problem: Print the following pattern for n=4 and m=5
*****
*   *
*   *
*****
*/

public class P2 {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

        //outer loop for rows
        for (int i=1; i<=n; i++) {

            //inner loop for columns and print stars
            for (int j=1; j<=m; j++) {

                // Condition to print stars at borders only
                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); //new line after each row
        }
    }
}
