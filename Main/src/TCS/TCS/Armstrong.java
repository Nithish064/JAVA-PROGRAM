package TCS;
import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int originalNumber = num, remainder, result = 0;
        int numDigits = String.valueOf(num).length();

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, numDigits);
            originalNumber /= 10;
        }
        return result == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(num + (isArmstrong(num) ? " is an Armstrong number." : " is not an Armstrong number."));
        
        sc.close();
    }
}