package Strings;


public class Main {
    public static void Printfrequency(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) { // Check if the character is a letter
                freq[Character.toLowerCase(ch) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.print((char)(i + 'a'));
                System.out.print(freq[i] + " ");
            }
        }
    }

    public static void main(String args[]) {
        String str = "TakeUforWard"; // Example input with mixed case
        Printfrequency(str);
    }
}
