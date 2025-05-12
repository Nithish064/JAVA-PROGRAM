package Numbers;

/*
An Ugly Number is a number whose only prime factors are 2, 3, or 5.

Examples: 1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 30
 */

public class UglyNumber {
    static boolean isUgly(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println(n + (isUgly(n) ? " is an Ugly Number" : " is Not an Ugly Number"));
    }
}
