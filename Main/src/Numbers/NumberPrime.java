package Numbers;

public class NumberPrime {

    static boolean prime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i<=n/2;++i) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isTwinPrime(int n) {
        // Check if n and (n - 2) OR (n and n + 2) are both prime
        if (prime(n) && (prime(n - 2) || prime(n + 2))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 19;

        if (isTwinPrime(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
