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
