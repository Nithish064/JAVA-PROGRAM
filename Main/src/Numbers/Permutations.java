package Numbers;
public class Permutations {


    static long fact(int n)
    {
        long fact = 1;
        for(int i = 1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    static long Permutations(int n, int r)
    {
        return fact(n) / fact(n-r);
    }
    
    
    public static void main(String[] args) {
    int n = 5;
    int r = 3;

    long ans = Permutations(n,r);

    System.out.println(ans);
    }
}
