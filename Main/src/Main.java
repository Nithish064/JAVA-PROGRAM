class checker{
    public boolean prime(int n) {
        if(n <= 1)
        {
            return false;
        }

        for(int i=2;i<=n/2;++i)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

public class Main
{
    public static void main(String[] args) {
        int n = 23;

        checker checker = new checker();

        boolean ans = checker.prime(n);

        if(ans)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }
}