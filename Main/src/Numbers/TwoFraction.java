package Numbers;
public class TwoFraction {

    static int Gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return Gcd(b, a % b); 
    }
    
    static String AddFraction(int n1, int d1, int n2, int d2)
    {
        int commondenomitor = d1 * d2;

        int newn1 = n1 * d2;
        int newn2 = n2 * d1;

        int resultSet = newn1 + newn2;

        int commondivisor = Gcd(resultSet, commondenomitor);
        resultSet /= commondivisor;
        commondenomitor /= commondivisor;

        return resultSet + "/" + commondenomitor;
    }

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int d1 = 2;
        int d2 = 3;

        String result = AddFraction(n1,d1,n2,d2);

        System.out.println("Addtion of fraction : " + result);
    }
}
