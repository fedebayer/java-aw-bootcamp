package aRecursionGenericTypes;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1)); // true
        System.out.println(isPalindrome(12)); // false
        System.out.println(isPalindrome(123)); // false
        System.out.println(isPalindrome(12321)); // true
        System.out.println(isPalindromeWithoutRecursive(1)); // true
        System.out.println(isPalindromeWithoutRecursive(12)); // false
        System.out.println(isPalindromeWithoutRecursive(123)); // false
        System.out.println(isPalindromeWithoutRecursive(12321)); // true
    }
    public static boolean isPalindrome(int number) {
        // Convert the number to a string for easier digit manipulation
        String numberStr = Integer.toString(number);
        return isPalindromeRecursive(numberStr, 0, numberStr.length() - 1);
    }

    private static boolean isPalindromeRecursive(String numberStr, int start, int last) {
        // Base case: when the beginning is greater than or equal to the end, it is palindrome
        if (start >= last) { return true; }
        if (numberStr.charAt(start) != numberStr.charAt(last)) { return false; }
        return isPalindromeRecursive(numberStr, start + 1, last - 1);
    }

    public static boolean isPalindromeWithoutRecursive(int number) {
        String numberStr = Integer.toString(number);
        int start = 0;
        int last = numberStr.length() - 1;

        while (start < last) {
            if (numberStr.charAt(start) != numberStr.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }

        return true;
    }
}
