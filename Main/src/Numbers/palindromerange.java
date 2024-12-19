package Numbers;
public class palindromerange {
    
    static boolean Palindrome(int n)
    {
        int r,sum=0,temp;

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum*10) + r;
            n = n / 10;
        }

        if (sum == temp) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int min = 10;
    int max = 100;

    for(int i = min; i<= max; i++)
    {
        if(Palindrome(i)){
            System.out.print(i + " ");
        }
    }
    }
}
