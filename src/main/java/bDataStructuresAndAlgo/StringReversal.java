package bDataStructuresAndAlgo;

public class StringReversal {
    public static String reverseString(String str) {
        // Base case: If the string is empty or has only one character, return it as is.
        if (str == null || str.length() <= 1) {
            return str;
        } else {
            // Recursive case: Return the last character of the string followed by the reversed substring.
            char lastChar = str.charAt(str.length() - 1);
            String substring = str.substring(0, str.length() - 1);
            return lastChar + reverseString(substring);
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!"; // Replace with the string you want to reverse.

        String reversedString = reverseString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}
