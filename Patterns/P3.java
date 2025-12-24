/*Problem: Print the following pattern for n=4
*
**
***
**** 
*/

public class P3 {
    public static void main(String args []) {

        int n = 4;

        //outer loop for rows
        for (int i=1; i<=n; i++) {

            //inner loop for columns and print stars
            for (int j=1; j<=i; j++) {

                System.out.print("*");
            }

            System.out.println(); //new line after each row
        }
    }
   
}
