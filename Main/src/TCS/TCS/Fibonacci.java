package TCS;
import java.util.Scanner;

public class Fibonacci {
    
    // Function to generate and print Fibonacci sequence up to n terms
    public static void generateFibonacci(int n) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // Call the function to generate and print the Fibonacci sequence
        generateFibonacci(n);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}