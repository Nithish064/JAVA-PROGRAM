package Numbers;

public class NumberCategory {
    static String categorizeNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        if (sum == n) return "Perfect";
        else if (sum > n) return "Abundant";
        else return "Deficient";
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(n + " is a " + categorizeNumber(n) + " Number");
    }
}
