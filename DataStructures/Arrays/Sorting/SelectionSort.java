public class SelectionSort {


    /*
    Selection Sort Algorithm:
    1. Start at the beginning of the array.
    2. Find the smallest (or largest, depending on sorting order) element in the array.
    3. Swap this smallest element with the first element of the array.
    4. Move to the next position in the array and repeat steps 2 and 3 for the remaining unsorted elements.
    5. Continue this process until the entire array is sorted.
    Time Complexity: O(n^2) in all cases (worst, average, and best) because it always involves nested loops.
    Space Complexity: O(1) as it is an in-place sorting algorithm.
    Stable: No (the relative order of equal elements may not be preserved).
    Adaptive: No (the algorithm does not take advantage of existing order in the array).
    In-Place: Yes
    Worst-case scenario: Always O(n^2) regardless of initial order.
    Best-case scenario: Always O(n^2) regardless of initial order.
    Average-case scenario: Always O(n^2) regardless of initial order.
    */

    //Code Implementation

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
