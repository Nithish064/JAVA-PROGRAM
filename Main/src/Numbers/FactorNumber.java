package Numbers;

/*
 * ✅ What does the program do?
It prints all numbers that divide n without a remainder → these are called factors.

✅ Example from your code
Input:
n = 6
Steps:

Check 1 → 6 % 1 == 0 → print 1

Check 2 → 6 % 2 == 0 → print 2

Check 3 → 6 % 3 == 0 → print 3

Check 4 → 6 % 4 != 0 → skip

Check 5 → 6 % 5 != 0 → skip

Check 6 → 6 % 6 == 0 → print 6
 */
public class FactorNumber {
    public static void main(String[] args) {
        int n = 6;

        for(int i = 1;i<=n;i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
