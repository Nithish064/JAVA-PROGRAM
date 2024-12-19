package Conversion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 27;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal: " + decimal + " -> binary: " + binary);
    }
}
