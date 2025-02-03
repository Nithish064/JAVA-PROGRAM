package TCS;
import java.util.Scanner;

// Class to handle the logic of finding the greatest number
class GreatestNumberFinder {

    // Method to find the greatest number among three
    public int findGreatest(int num1, int num2, int num3) {
        int greatest;
        
        if (num1 > num2) {
            if (num1 > num3) {
                greatest = num1;
            } else {
                greatest = num3;
            }
        } else {
            if (num2 > num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }
        }
        return greatest;
    }
}

// Main class to execute the program
public class greatestamongthreenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Create an object of GreatestNumberFinder
        GreatestNumberFinder finder = new GreatestNumberFinder();
        
        // Call method to find the greatest number
        int greatest = finder.findGreatest(num1, num2, num3);

        // Output the result
        System.out.println("The greatest number is: " + greatest);
    }
}
