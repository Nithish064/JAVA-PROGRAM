package TCS;
import java.util.*;
// Class to handle factorial calculation
class FactorialCalculator {

    // Method to calculate factorial of a number
    public long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Main class to execute the program
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Create an object of FactorialCalculator
        FactorialCalculator calculator = new FactorialCalculator();
        long fact = calculator.calculateFactorial(n);  // Call method to calculate factorial

        System.out.println("Factorial of " + n + " is " + fact);  // Output the result
    }
}
