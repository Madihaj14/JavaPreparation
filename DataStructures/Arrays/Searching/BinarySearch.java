public class BinarySearch {    

    /*
    Binary Search
    - A search algorithm that finds the position of a target value within a sorted array by repeatedly dividing the search interval in half.
    - Time Complexity: O(log n) in the worst case, where n is the number of elements in the array.
    - Space Complexity: O(1) for iterative implementation and O(log n) for recursive implementation due to call stack space.
    - Requires the array to be sorted before performing the search.
    - More efficient than linear search for large datasets.
    - Implementation involves maintaining two pointers (low and high) to track the current search interval and adjusting them based on comparisons with the target value.

     */

    //Example code of Binary Search in Java using while loop

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // To avoid potential overflow

            if (arr[mid] == target) {
                return mid; // Return the index if the target is found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if the target is not found
    }

    //Example code of Binary Search in Java using recursion
    
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Base case: target not found
        }

        int mid = low + (high - low) / 2; // To avoid potential overflow

        if (arr[mid] == target) {
            return mid; // Return the index if the target is found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search in the right half
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1); // Search in the left half
        }
    }


    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearch(sortedArray, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
