package TCS;
import java.util.*;

public class RankElement {


    // Example 1:
// Input: 20 15 26 2 98 6
// Output: 4 3 5 1 6 2
// Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…


    public static void main(String[] args) {
        int[] arr = {20,15,26,2,98,6};
        int n = 6;

        for(int i = 0;i<n;i++)
        {
            Set <Integer> s = new HashSet <Integer> ();
            for(int j = 0; j<n;j++)
            {
                if(arr[j] < arr[i])
                {
                    s.add(arr[j]);
                }
            }
            int rank = s.size() + 1;
            System.out.print(rank + " ");
        }
    }
}
