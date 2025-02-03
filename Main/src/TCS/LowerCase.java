package TCS;
import java.util.Scanner;

// Class to handle the case checking logic
class CharacterChecker {

    // Method to check if the character is lowercase
    public String checkCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return "lowercase";
        } else {
            return "UpperCase";
        }
    }
}

// Main class to execute the program
public class LowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input the character
        System.out.print("Enter a character: ");
        char ch = s.next().trim().charAt(0);

        // Create an object of CharacterChecker
        CharacterChecker checker = new CharacterChecker();

        // Check the case of the character
        String result = checker.checkCase(ch);

        // Output the result
        System.out.println(result);
    }
}
