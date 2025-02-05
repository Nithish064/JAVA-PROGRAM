package TCS;
import java.util.Arrays;

// Class to check if two strings are anagrams
class AnagramChecker {
    // Method to check if two strings are anagrams
    public boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase for case insensitivity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}

// Main class
public class Anagram {
    public static void main(String[] args) {
        String str1 = "he is listen";
        String str2 = "is he silent";

        // Creating an object of AnagramChecker
        AnagramChecker checker = new AnagramChecker();
        boolean result = checker.isAnagram(str1, str2);

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
