package Numbers;
public class PerfectNumber {

    static boolean Perfectnumber(int n)
    {
        int sum = 0;
        for(int i = 1;i*i<n;i++)
        {
            if(n % i == 0)
            {
                if(i*i == n || i == 1)
                {
                    sum = sum + i;
                }
                else
                {
                    sum = sum + i + n / i;
                }
            }
        }
        if(sum == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean ex1 = Perfectnumber(6);


        if(ex1 == true)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}
