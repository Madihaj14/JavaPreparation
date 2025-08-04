public class EasyProblems {
     // 1. Check Palindrome Number
    public static boolean isPalindrome(int n) {
        int original = n, rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }

    // 2. Reverse a Number
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // 3. Sum of Digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 4. Armstrong Number
    public static boolean isArmstrong(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return original == sum;
    }

    // 5. Factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // 6. Fibonacci Series up to n terms
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 7. Prime Check
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // 8. Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 9. Count Digits
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    // 10. Simple Pattern Printing
    public static void printRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            System.out.println("*".repeat(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Palindrome (121): " + isPalindrome(121));
        System.out.println("Reverse of 1234: " + reverseNumber(1234));
        System.out.println("Sum of digits (456): " + sumOfDigits(456));
        System.out.println("Armstrong (153): " + isArmstrong(153));
        System.out.println("Factorial (5): " + factorial(5));
        fibonacci(7);
        System.out.println("Is 29 prime? " + isPrime(29));
        System.out.println("Leap Year 2024? " + isLeapYear(2024));
        System.out.println("Digits in 6789: " + countDigits(6789));
        System.out.println("Pattern:");
        printRightTriangle(5);
    }
}
