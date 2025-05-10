package Numbers;

public class Combinatorics {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println("C(" + n + "," + r + ") = " + combination(n, r));
    }
}
