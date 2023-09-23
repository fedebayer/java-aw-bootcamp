package bDataStructuresAndAlgo;

public class IntegerProductWithoutMultiplication {
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0; // Anything multiplied by 0 is 0.
        } else if (b > 0) {
            return a + multiply(a, b - 1); // Recursively add 'a' 'b' times.
        } else {
            return -multiply(a, -b); // Handle negative 'b' by making it positive and negating the result.
        }
    }

    public static void main(String[] args) {
        int num1 = 5; // Replace with the first integer.
        int num2 = 4; // Replace with the second integer.

        int product = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + product);
    }
}
