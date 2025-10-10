public class Notes {
    

    /*
    Linear Search
    - A simple search algorithm that checks each element in a list sequentially until the desired element is found or the list ends.
    - Time Complexity: O(n) in the worst case, where n is the number of elements in the list.
    - Space Complexity: O(1) since it requires a constant amount of additional space.
    - Suitable for small or unsorted datasets.
    - Not efficient for large datasets compared to more advanced search algorithms like binary search.
    - Implementation involves iterating through the array and comparing each element to the target value.

     */

    //Example code of Linear Search in Java

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }
    
}
