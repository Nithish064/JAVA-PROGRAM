package TCS;
/*
1
12
123
1234
 */

public class pattern4 {
    public static void main(String args[])
    {
        int n = 4;
        pattern1(n);
    }

    static void pattern1(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}