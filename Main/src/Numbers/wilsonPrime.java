package Numbers;


public class wilsonPrime {
    static boolean isPrimeWilson(int n) {
        if (n <= 1) return false;
        int fact = 1;
        for (int i = 2; i < n; i++) {
            fact = (fact * i) % n;
        }
        return fact == n - 1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + (isPrimeWilson(n) ? " is Prime (Wilson's Test)" : " is Not Prime (Wilson's Test)"));
    }
}
