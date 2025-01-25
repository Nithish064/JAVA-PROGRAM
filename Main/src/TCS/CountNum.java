package TCS;
public class CountNum {
    public static void main(String[] args) {
        int n = 233533;
        int c = 0;
        while (n > 0)
        {
            int r = n % 10;
            if(r == 3)
            {
                c++;
            }
            n /= 10;
        }
        System.out.println(c);
    }
}