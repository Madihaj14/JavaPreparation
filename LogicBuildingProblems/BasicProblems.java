public class BasicProblems {
    // 1. Check Even or Odd
    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    // 2. Multiplication Table
    public static void printMultiplicationTable(int n, int upto) {
        for (int i = 1; i <= upto; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }

    // 3. Sum of First N Natural Numbers
    public static int sumOfNaturals(int n) {
        return n * (n + 1) / 2;
    }

    // 4. Sum of Squares of First N Naturals
    public static int sumOfSquares(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    // 5. Swap Two Numbers (without temp)
    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    // 6. Closest Number to target in array
    public static int closest(int[] arr, int target) {
        int closest = arr[0];
        for (int x : arr) {
            if (Math.abs(x - target) < Math.abs(closest - target)) {
                closest = x;
            }
        }
        return closest;
    }

    // 7. Dice Roll Simulation: sum of N rolls
    public static int diceSum(int rolls) {
        java.util.Random rand = new java.util.Random();
        int sum = 0;
        for (int i = 0; i < rolls; i++) {
            sum += rand.nextInt(6) + 1;
        }
        return sum;
    }

    // 8. N-th term of Arithmetic Progression: a, d
    public static int nthTermAP(int a, int d, int n) {
        return a + (n - 1) * d;
    }

    // Main method: simple demonstration
    public static void main(String[] args) {
        System.out.println("isEven(5): " + isEven(5));
        printMultiplicationTable(7, 10);
        System.out.println("Sum of first 100 naturals: " + sumOfNaturals(100));
        System.out.println("Sum of squares of first 10: " + sumOfSquares(10));
        int[] swapped = swap(5, 9);
        System.out.printf("Swapped 5,9 → %d,%d%n", swapped[0], swapped[1]);
        int[] arr = {3, 8, 15, 1};
        System.out.println("Closest to 10 in array: " + closest(arr, 10));
        System.out.println("Sum of 5 dice rolls: " + diceSum(5));
        System.out.println("5th term of AP(2,3): " + nthTermAP(2, 3, 5));
    }
}
