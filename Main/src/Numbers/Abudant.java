package Numbers;

/*
 * It checks if a number n is an abundant number.

➥ A number is called abundant if the sum of its proper divisors (excluding itself) is greater than the number itself.

Example:

12 → divisors: 1, 2, 3, 4, 6 → sum = 16 → 16 > 12 → abundant → Yes

21 → divisors: 1, 3, 7 → sum = 11 → 11 < 21 → not abundant → No
 */

public class Abudant {

    static int Abadant(int n)
    {
        int sum = 0;
        for(int i = 1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 21;

        int sum = Abadant(n);

        if(sum > n)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
