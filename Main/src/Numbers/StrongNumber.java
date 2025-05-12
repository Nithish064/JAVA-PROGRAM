package Numbers;

/*
A Strong Number is a number whose sum of the factorials of its digits equals the number itself.

Example:
145 →
1! + 4! + 5! = 1 + 24 + 120 = 145 → ✅ Strong Number
 */
public class StrongNumber {
    static int Fact(int n)
    {
        int result = 1;
        for(int i = 1; i<=n;i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 145,orginalnumeber,remainder,sum=0;

        orginalnumeber = n;

        while(n>0)
        {
            remainder = n % 10;
            sum += Fact(remainder);
            n = n/10;
        }

        if(sum == orginalnumeber)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
}
