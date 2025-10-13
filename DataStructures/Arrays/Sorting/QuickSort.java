public class QuickSort {

    /*
     * QuickSort Algorithm Implementation
     * Time Complexity: O(n log n) on average, O(n^2) in the worst case
     * Space Complexity: O(log n) due to recursion stack
     * Stable: No
     * In-Place: Yes
     * Not Adaptive
     * Not Online
     * Not Recursive (but can be implemented recursively)
     * Not Comparison-Based (it is comparison-based)
     * Not Non-Comparison-Based
     * Not Internal
     * Not External
     * Not Parallel
     * Not Distributed
     * Not Cache-Efficient
     * Not Memory-Efficient
     * 
     */
    
    // Function to perform QuickSort on the array
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array
    private static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Unsorted array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Utility function to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }



}
