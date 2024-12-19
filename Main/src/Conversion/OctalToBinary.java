package Conversion;

public class OctalToBinary {
    public static void main(String[] args) {
        String octal = "27";
        int decimal = Integer.parseInt(octal,8);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("binary: " + binary);

    }
}
