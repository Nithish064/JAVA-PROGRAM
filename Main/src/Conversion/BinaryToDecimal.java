package Conversion;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryString = "1011"; // Example binary string
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println("Binary: " + binaryString + " -> Decimal: " + decimal);
    }
}