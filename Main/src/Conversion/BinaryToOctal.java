package Conversion;

public class BinaryToOctal {
    public static void main(String[] args) {
        String binaryString = "1011"; // Example binary string
        int decimal = Integer.parseInt(binaryString, 2);
        String Octal = Integer.toOctalString(decimal);
        System.out.println("Binary: " + binaryString + " -> Octal: " + Octal);
    }
}
