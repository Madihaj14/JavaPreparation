public class JaggedArr {
    public static void main(String[] args) 
    {
        // Declare a jagged array
       int nums [][] = new int[3][]; //jagged

       nums[0] = new int[3]; // First row with 3 columns
       nums[1] = new int[4]; // Second row with 4 columns
       nums[2] = new int[2]; // Third row with 2 columns

       // Fill the jagged array with values
       
       for (int i = 0; i < nums.length; i++) 
       {
           for (int j = 0; j < nums[i].length; j++) 
           {
               nums[i][j] = (int) (Math.random() * 10); // Random values between 0 and 9
           }
       }

        // Print the jagged array using an enhanced for loop

        for (int n[] : nums) 
        {
            for (int m : n) 
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
