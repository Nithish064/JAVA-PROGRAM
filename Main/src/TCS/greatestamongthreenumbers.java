package TCS;
import java.util.*;

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

        // Find the greatest using if-else statements
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

        // Output the result
        System.out.println("The greatest number is: " + greatest);
    }

}
