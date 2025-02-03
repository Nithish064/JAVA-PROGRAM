package TCS;
import java.util.*;
// Class to handle Fibonacci sequence generation
class FibonacciGenerator {

    // Method to generate and print Fibonacci sequence up to n terms
    public void generateFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Update terms
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();  // Move to the next line after the sequence
    }
}

// Main class to execute the program
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // Create an object of FibonacciGenerator
        FibonacciGenerator generator = new FibonacciGenerator();
        
        // Call method to generate and print the Fibonacci sequence
        generator.generateFibonacci(n);
    }
}
