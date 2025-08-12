public class Arrays2D {
    public static void main(String[] args) {

        // Declare and initialize a 2D array
        int nums [][] = new int [3][4];

        // Using the same loop to Fill the 2D array with values
        // Adding random numbers, using type casting to convert double value to int

        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = 0; j < nums[i].length; j++) 
            {
                nums[i][j] = (int) (Math.random() * 100); // Random numbers between 0 and 99
            }
        }

        // Print the 2D array using the same for loop
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = 0; j < nums[i].length; j++) 
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Print the 2D array using enhanced for loop
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
