public class BubbleSort {

    /*
    Bubble Sort Algorithm:
    1. Start at the beginning of the array.
    2. Compare the first two elements.
    3. If the first element is greater than the second, swap them.
    4. Move to the next pair of elements and repeat the comparison and swap if necessary.
    5. Continue this process until the end of the array is reached.
    6. After each pass through the array, the largest unsorted element will have "bubbled up" to its correct position.
    7. Repeat the entire process for the remaining unsorted elements until no swaps are needed on a new pass.
    Time Complexity: O(n^2) in the worst and average case, O(n) in the best case (when the array is already sorted).
    Space Complexity: O(1) as it is an in-place sorting algorithm.
    Stable: Yes
    Adaptive: Yes (can be optimized with a flag to stop if no swaps are made)
    In-Place: Yes
    Worst-case scenario: When the array is sorted in reverse order, requiring the maximum number of swaps.
    Best-case scenario: When the array is already sorted, requiring only one pass through the array to confirm it is sorted.
    Average-case scenario: Generally requires about n^2/4 comparisons and n^2/4 swaps.
     */


    //Code Implementation
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
