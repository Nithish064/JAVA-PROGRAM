package Numbers;

// Class to handle permutation calculations
class PermutationCalculator {
    
    // Method to calculate factorial
    private long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate permutations P(n, r) = n! / (n - r)!
    public long calculatePermutations(int n, int r) {
        if (r > n) {
            throw new IllegalArgumentException("r cannot be greater than n");
        }
        return factorial(n) / factorial(n - r);
    }
}

// Main class
public class Permutations {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;

        // Creating an object of PermutationCalculator
        PermutationCalculator calculator = new PermutationCalculator();
        long ans = calculator.calculatePermutations(n, r);

        System.out.println("Permutations P(" + n + ", " + r + ") = " + ans);
    }
}
