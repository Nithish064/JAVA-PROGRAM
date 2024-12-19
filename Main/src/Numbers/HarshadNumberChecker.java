package Numbers;
import java.util.Scanner;

public class HarshadNumberChecker {

    // Method to calculate the sum of digits
    static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10;       // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate the sum of digits
        int sum = sumOfDigits(number);
        
        // Check if the number is a Harshad Number
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        scanner.close();
    }
}