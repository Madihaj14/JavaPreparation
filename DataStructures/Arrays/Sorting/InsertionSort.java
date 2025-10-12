public class InsertionSort {

    /*
    Insertion Sort Algorithm:
    1. Start with the second element (index 1) of the array.
    2. Compare it with the elements before it (to its left).
    3. If the current element is smaller than the compared element, shift the compared element one position to the right.
    4. Repeat this process until you find the correct position for the current element.
    5. Insert the current element at its correct position.
    6. Move to the next element and repeat steps 2-5 until the entire array is sorted.
    Time Complexity: O(n^2) in the worst and average case, O(n) in the best case (when the array is already sorted).
    Space Complexity: O(1) as it is an in-place sorting algorithm.
    Stable: Yes
    Adaptive: Yes (efficient for partially sorted arrays)
    In-Place: Yes
    Worst-case scenario: When the array is sorted in reverse order, requiring maximum shifts.
    Best-case scenario: When the array is already sorted, requiring only n-1 comparisons and no shifts.
    Average-case scenario: Generally requires about n^2/4 comparisons and n^2/4 shifts.
    */

    //Code Implementation
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    
}
