package TCS;
public class pattern6 {
    public static void main(String args[])
    {
        int n = 4;
        pattern5(n);
        
    }

    static void pattern5(int n)
    {
        for(int row = 0; row < 2*n; row++)
        {
            int totalcolInRow = row > n ? 2*n-row : row;

            int noOfspaces = n - totalcolInRow;
            for(int s = 0; s < noOfspaces; s++)
            {
                System.out.print(" ");
            }
            for(int col = 0; col < totalcolInRow; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
