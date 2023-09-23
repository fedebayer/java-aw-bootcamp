package bDataStructuresAndAlgo;

public class RecursiveFactorial {
    public static long recursiveFactorial(int n) {
        // Base case: If n is 0 or 1, the factorial is 1.
        if (n <= 1) {
            return 1;
        } else {
            // Recursive case: Multiply n by the factorial of (n-1).
            return n * recursiveFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Replace this with the number for which you want to find the factorial.
        long factorial = recursiveFactorial(n);
        System.out.println("Factorial of " + n + " is " + factorial);
        int n2 = 10;
        long factorial2 = recursiveFactorial(n2);
        System.out.println("Factorial of " + n2 + " is " + factorial2);
    }
}
