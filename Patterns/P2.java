package JavaPreparation.Patterns;

//Problem: Print the following pattern for n=4 and m=5

public class P2 {
    public static void main(String[] args) {
        // for (int counter = 0; counter<11; counter++){
          //   System.out.println(counter);
         //}
         int n = 4;
         int m = 5;
         //outer loop
         for (int i=1; i<=n; i++){
             //inner loop
             for (int j=1; j<=m; j++){
                 //cell-> (i,j)
                 if(i==1 || j==1 || i==n || j==m) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
 
     }
}
