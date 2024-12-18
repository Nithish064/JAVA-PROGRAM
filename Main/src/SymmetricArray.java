public class SymmetricArray {
    public static void main(String[] args) {
        int[][] m = {{1,2},{2,1},{3,4},{4,5},{5,4}};

        int n = 5;

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(m[j][0] == m[i][1] && m[j][1] == m[i][0])
                {
                    System.out.print("(" + m[i][1] + "," + m[i][0] + ")");
                    break;
                }
            }
        }
    }
}
