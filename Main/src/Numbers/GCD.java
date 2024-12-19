package Numbers;
public class GCD {

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
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 10;

        int result = Gcd(n1,n2);

        System.out.println("gcd of n1 and n2 : " + result);
    }
}
