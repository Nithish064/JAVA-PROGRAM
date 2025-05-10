package Numbers;

/*
It checks whether a number n is a perfect number.

➥ A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).

Examples:

6 → 1 + 2 + 3 = 6 → Perfect Number

28 → 1 + 2 + 4 + 7 + 14 = 28 → Perfect Number

12 → 1 + 2 + 3 + 4 + 6 = 16 → Not a Perfect Number
 */


 public class PerfectNumber {
 
     static boolean isPerfectNumber(int n) {
         int sum = 0;
         for (int i = 1; i <= n / 2; i++) {  // loop only to n/2
             if (n % i == 0) {
                 sum += i;
             }
         }
         return sum == n;
     }
 
     public static void main(String[] args) {
         int n = 6;
         boolean result = isPerfectNumber(n);
 
         if (result) {
             System.out.println(n + " is a Perfect Number");
         } else {
             System.out.println(n + " is Not a Perfect Number");
         }
     }
 }
 