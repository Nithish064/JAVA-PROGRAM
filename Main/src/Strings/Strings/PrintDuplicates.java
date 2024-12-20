package Strings;


public class PrintDuplicates {
    public static void main(String[] args) {
        String str = "hello world"; // Example input

        printDuplicates(str);
    }

    static void printDuplicates(String str) {
        System.out.println("Duplicate characters:");

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isDuplicate = false;

            // Check if current character is already counted
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's a duplicate and not a space, count its occurrences
            if (!isDuplicate && current != ' ') {
                int count = 1; // Start counting the current character
                for (int k = i + 1; k < str.length(); k++) {
                    if (str.charAt(k) == current) {
                        count++;
                    }
                }

                // If count is greater than 1, it's a duplicate
                if (count > 1) {
                    System.out.println(current + ": " + count + " times");
                }
            }
        }
    }
}
