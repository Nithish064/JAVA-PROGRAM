package TCS;
import java.util.Scanner;

public class greatestamongthreenumbers {

    // Function to find the greatest number among three
    public static int findGreatest(int num1, int num2, int num3) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Call function to find the greatest number
        int greatest = findGreatest(num1, num2, num3);

        // Output the result
        System.out.println("The greatest number is: " + greatest);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}