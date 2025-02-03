package TCS;
import java.util.Scanner;

// PrimeChecker class to encapsulate prime number logic
class PrimeChecker {
    // Method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }
        return true; // No divisors found, it's prime
    }
}

// Main class
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Taking user input

        PrimeChecker checker = new PrimeChecker(); // Creating an object of PrimeChecker
        if (checker.isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close(); // Closing the scanner
    }
}
