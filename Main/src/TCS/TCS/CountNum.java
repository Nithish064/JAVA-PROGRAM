package TCS;

// Class to handle the digit counting
class DigitCounter {

    // Method to count occurrences of a specific digit in a number
    public int countOccurrences(int num, int digit) {
        int count = 0;

        // Loop through the digits of the number
        while (num > 0) {
            int remainder = num % 10;  // Get the last digit
            if (remainder == digit) {
                count++;  // Increment count if the digit matches
            }
            num /= 10;  // Remove the last digit
        }

        return count;
    }
}

// Main class to execute the program
public class CountNum {
    public static void main(String[] args) {
        int num = 233533;
        int digit = 3;

        // Create an object of DigitCounter
        DigitCounter counter = new DigitCounter();
        int count = counter.countOccurrences(num, digit);  // Call method to count occurrences

        System.out.println(digit + " occured in " + count + " times");  // Output the result
    }
}
