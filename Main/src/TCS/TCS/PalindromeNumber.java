package TCS;
public class PalindromeNumber {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n = 454;

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum*10) + r;
            n = n / 10;
        }

        if (sum == temp) {
            System.out.println("PALINDROME NUMBER");
        }
        else {
            System.out.println("NOT PALINDROME NUMBER");
        }
    }
}