package Numbers;
public class LCM {

    static int Gcd(int n1, int n2)
    {
        while(n2 != 0)
        {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }


    static int Lcm(int n1, int n2)
    {
        return Math.abs(n1 * n2) / Gcd(n1, n2);
    }
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;

        int ans = Lcm(n1,n2);

        System.out.println(ans);
    }
}
