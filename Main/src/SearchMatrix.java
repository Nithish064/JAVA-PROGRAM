import java.util.Arrays;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] m = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };
        int target = 7;
        System.out.println(Arrays.toString(Search(m,target)));
    }

    static int[] Search(int[][] m, int target)
    {
        int r = 0;
        int c = m.length - 1;

        while(r<m.length && c >= 0)
        {
            if(m[r][c] == target)
            {
                return new int[]{r,c};
            }

            if(m[r][c] < target)
            {
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1, -1};

    }
}
