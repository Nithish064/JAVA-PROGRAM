package TCS;
import java.util.Scanner;

// Class to check if a number is an Armstrong number
class ArmstrongChecker {
    // Method to check if a number is Armstrong
    public boolean isArmstrong(int num) {
        int originalNumber = num, remainder, result = 0;
        int numDigits = String.valueOf(num).length(); // Count digits dynamically

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, numDigits);
            originalNumber /= 10;
        }
        return result == num;
    }
}

// Main class to execute the program
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        // Create an object of ArmstrongChecker
        ArmstrongChecker checker = new ArmstrongChecker();
        boolean isArmstrong = checker.isArmstrong(num);
        
        // Display result
        if (isArmstrong) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}