package aRecursionGenericTypes;

public class DecimalToBinary {
    public static void main(String[] args) {
        String binary = decimalToBinary(10);
        System.out.println("The binary representation of 10 is: " + binary);
        String binary2 = decimalToBinary(15);
        System.out.println("The binary representation of 15 is: " + binary2);
        String binary3 = decimalToBinary(100);
        System.out.println("The binary representation of 100 is: " + binary3);
    }
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }
}
