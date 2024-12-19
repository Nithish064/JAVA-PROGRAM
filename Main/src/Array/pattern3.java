package Array;
public class pattern3 {
    public static void main(String args[])
    {
        int n = 4;
        pattern3(n);
        
    }

    static void pattern3(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n-row+1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
