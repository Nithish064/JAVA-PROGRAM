package TCS;

/*
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 
 */

public class pattern5 {
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
            for(int col = 0; col < totalcolInRow; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
