package Numbers;
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
