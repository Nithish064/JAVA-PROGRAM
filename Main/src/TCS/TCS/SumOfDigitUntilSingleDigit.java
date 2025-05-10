package TCS;

import java.util.Scanner;

public class SumOfDigitUntilSingleDigit {
    public static int sumUntilSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumUntilSingleDigit(num);
        System.out.println("Single digit sum: " + result);
    }
}
