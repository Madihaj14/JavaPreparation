public class Arrays3D {
    public static void main(String[] args) 
    {
        // Declare a 3D array
        int[][][] nums = new int[2][3][4]; // 2 layers, 3 rows, 4 columns

        // Fill the 3D array with values
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = 0; j < nums[i].length; j++) 
            {
                for (int k = 0; k < nums[i][j].length; k++) 
                {
                    nums[i][j][k] = (int) (Math.random() * 100); // Random values between 0 and 99
                }
            }
        }

        // Print the 3D array using an enhanced for loop
        for (int[][] layer : nums) 
        {
            for (int[] row : layer) 
            {
                for (int value : row) 
                {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println("-----"); // Separator between layers
        }
    }
}
