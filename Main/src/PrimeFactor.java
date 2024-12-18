public class PrimeFactor {
    public static void main(String[] args) {

        // Input a number
        System.out.print("Enter a number: ");
        int number = 10;
        
        System.out.println("Prime factors of " + number + " are:");
        
        // Find and print prime factors
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i; // Divide the number by the prime factor
            }
        }
    }
}
