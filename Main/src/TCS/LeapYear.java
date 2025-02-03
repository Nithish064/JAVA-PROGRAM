package TCS;
import java.util.Scanner;

// Class to handle the logic for checking leap year
class LeapYearChecker {

    // Method to check if a given year is a leap year
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

// Main class to execute the program
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the year
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Create an object of LeapYearChecker
        LeapYearChecker checker = new LeapYearChecker();

        // Check if the year is a leap year
        if (checker.isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}
