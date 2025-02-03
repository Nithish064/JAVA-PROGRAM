package Numbers;

// Class to check if a number is positive or negative
class NumberChecker {
    // Method to check if a number is positive, negative, or zero
    public String checkNumber(int n) {
        if (n > 0) {
            return "Positive";
        } else if (n < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}

// Main class
public class PositiveORNegative {
    public static void main(String[] args) {
        int n = 10; // Example number

        // Creating an object of NumberChecker
        NumberChecker checker = new NumberChecker();
        String result = checker.checkNumber(n);

        System.out.println("The number is: " + result);
    }
}
