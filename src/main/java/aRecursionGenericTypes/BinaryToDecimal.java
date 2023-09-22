package aRecursionGenericTypes;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = binaryToDecimal("1010");
        System.out.println("The binary representation of 1010 is: " + binary);
        int binary2 = binaryToDecimal("1111");
        System.out.println("The binary representation of 1111 is: " + binary2);
        int binary3 = binaryToDecimal("1100100");
        System.out.println("The decimal representation of 1100100 is: " + binary3);
    }
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);
            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}
