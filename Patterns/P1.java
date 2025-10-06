public class P1 {
    

    // Pattern 1: Rectangle of Stars
public class Main {
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
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


}
   