public class primerange {

    static boolean PrimeRange(int num)
    {
        int  i = 2;
        boolean flag = false;

        if(num == 0 || num == 1) {
            flag = true;
        }

        for(i = 2; i <= num / 2; ++i) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }

        if(!flag) {
           return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 10;

        for(int i = a;i<=b;i++)
        {
            if(PrimeRange(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}
