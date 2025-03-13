package TCS;
import java.util.Scanner;

public class LowerCase {

    // Function to check if the character is lowercase
    public static String checkCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return "lowercase";
        } else {
            return "UpperCase";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input the character
        System.out.print("Enter a character: ");
        char ch = s.next().trim().charAt(0);

        // Check the case of the character
        String result = checkCase(ch);

        // Output the result
        System.out.println(result);

        s.close(); // Close the scanner to prevent resource leaks
    }
}