public class EasyProblems {

    // 1. Sum of Digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 2. Reverse Digits
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // 3. Prime Testing
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // 4. Check if n is a Power of a number (base > 1)
    public static boolean isPower(int n, int base) {
        if (n < 1 || base <= 1) return false;
        while (n % base == 0) {
            n /= base;
        }
        return n == 1;
    }

    // 5. Distance between Two Points
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // 6. Valid Triangle Check
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // 7. Overlapping Rectangles
    public static boolean doRectanglesOverlap(int l1x, int l1y, int r1x, int r1y,
                                              int l2x, int l2y, int r2x, int r2y) {
        // If one rectangle is on left side of other
        if (l1x >= r2x || l2x >= r1x) return false;
        // If one rectangle is above other
        if (l1y <= r2y || l2y <= r1y) return false;
        return true;
    }

    // 8. Factorial of a Number
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // 9. Pair Cube Count
    public static int pairCubeCount(int n) {
        int count = 0;
        for (int a = 1; a * a * a < n; a++) {
            for (int b = a; a * a * a + b * b * b <= n; b++) {
                if (a * a * a + b * b * b == n) count++;
            }
        }
        return count;
    }

    // 10. GCD / HCF
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 11. LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 12. Perfect Number
    public static boolean isPerfectNumber(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    // 13. Add Two Fractions
    public static String addFractions(int num1, int den1, int num2, int den2) {
        int num = num1 * den2 + num2 * den1;
        int den = den1 * den2;
        int g = gcd(num, den);
        return (num / g) + "/" + (den / g);
    }

    // 14. Day of the Week (Zeller's Congruence)
    public static String dayOfWeek(int d, int m, int y) {
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int K = y % 100;
        int J = y / 100;
        int h = (d + 13 * (m + 1) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[h];
    }

    // 15. Nth Fibonacci Number (iterative)
    public static int nthFibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 1;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // 16. Decimal to Binary
    public static String decimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }

    // 17. N-th term of 1, 3, 6, 10, 15, 21... (Triangular numbers)
    public static int nthTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    // 18. Armstrong Number
    public static boolean isArmstrong(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return original == sum;
    }

    // 19. Palindrome Number
    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    // 20. Digit Root
    public static int digitRoot(int n) {
        while (n > 9) {
            n = sumOfDigits(n);
        }
        return n;
    }

    // Demo in main()
    public static void main(String[] args) {
        System.out.println("Sum of Digits (456): " + sumOfDigits(456));
        System.out.println("Reverse (1234): " + reverseNumber(1234));
        System.out.println("Prime? 29: " + isPrime(29));
        System.out.println("Is 8 power of 2? " + isPower(8, 2));
        System.out.println("Distance (0,0) to (3,4): " + distance(0, 0, 3, 4));
        System.out.println("Valid Triangle (3,4,5): " + isValidTriangle(3, 4, 5));
        System.out.println("Rect Overlap? " + doRectanglesOverlap(0, 10, 10, 0, 5, 5, 15, 0));
        System.out.println("Factorial (5): " + factorial(5));
        System.out.println("Pair Cube Count (1729): " + pairCubeCount(1729));
        System.out.println("GCD(54, 24): " + gcd(54, 24));
        System.out.println("LCM(4, 5): " + lcm(4, 5));
        System.out.println("Perfect Number? 28: " + isPerfectNumber(28));
        System.out.println("Add Fractions 1/2 + 3/4: " + addFractions(1, 2, 3, 4));
        System.out.println("Day of week (9 Aug 2025): " + dayOfWeek(9, 8, 2025));
        System.out.println("8th Fibonacci: " + nthFibonacci(8));
        System.out.println("Decimal to Binary (10): " + decimalToBinary(10));
        System.out.println("10th Triangular Number: " + nthTriangularNumber(10));
        System.out.println("Armstrong (153): " + isArmstrong(153));
        System.out.println("Palindrome (121): " + isPalindrome(121));
        System.out.println("Digit Root (9875): " + digitRoot(9875));
    }
}