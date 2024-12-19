package Conversion;

public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 27;
    String octal = Integer.toOctalString(decimal);
    System.out.println("Octal value of " + decimal + " is " + octal);
    }
}
