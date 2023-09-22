package aRecursionGenericTypes;

public class Factorial {

    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println("The factorial of 5 is: " + factorial);
        int factorial2 = factorial(10);
        System.out.println("The factorial of 10 is: " + factorial2);
        int factorialG1 = (int) factorialG(5);
        System.out.println("The factorial of 5 is: " + factorialG1);
        double factorialG2 = factorialG(10.10);
        System.out.println("The factorial of 10 is: " + factorialG2);
    }
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static <T extends Number> double factorialG(T number) {
        double n = number.doubleValue();
        if (n == 0) {
            return 1;
        }
        return n * factorial((int) (n - 1));
    }
}
