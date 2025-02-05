class Palindrome {
    public void Palin(int n)
    {
        int rev = 0, rem, org = n;
        while (n != 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if(rev == org)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 12321;
        Palindrome p = new Palindrome();
        p.Palin(n);
}
}