package Conversion;

public class OctalToDecimal {
    public static void main(String[] args) {
        String octal = "12";
        int decimal = Integer.parseInt(octal,8);
        System.out.println("Octal : " + octal + " to Decimal " + decimal);
    }
}
