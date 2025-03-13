package TCS;
import java.util.Scanner;

public class LeapYear {

    // Function to check if a given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the year
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}