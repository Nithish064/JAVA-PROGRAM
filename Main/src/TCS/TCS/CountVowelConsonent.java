package TCS;

// Class to handle counting vowels, consonants, and spaces
class CharacterCounter {

    // Method to count vowels
    public int countVowels(String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    // Method to count consonants
    public int countConsonants(String str) {
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')) {
                consonants++;
            }
        }
        return consonants;
    }

    // Method to count white spaces
    public int countWhitespaces(String str) {
        int spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }
        return spaces;
    }
}

// Main class to execute the program
public class CountVowelConsonent {
    public static void main(String[] args) {
        String str = "green is the color";

        // Create an object of CharacterCounter
        CharacterCounter counter = new CharacterCounter();

        // Count vowels, consonants, and whitespaces
        int vowels = counter.countVowels(str);
        int consonants = counter.countConsonants(str);
        int spaces = counter.countWhitespaces(str);

        // Output the results
        System.out.println("Vowels Count: " + vowels);
        System.out.println("Consonants Count: " + consonants);
        System.out.println("Whitespaces Count: " + spaces);
    }
}
