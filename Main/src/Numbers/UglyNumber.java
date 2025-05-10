package Numbers;

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
