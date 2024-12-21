package Array;
import java.util.*;

public class AscendingDescendingarray {
    public static void main(String[] args) {
        int[] a = {6,3,4,2,5,1};
        int n = a.length;

        Arrays.sort(a);

        for(int i = 0; i<n/2; i++)
        {
            System.out.print(a[i] + " ");
        }
        for(int i=n-1; i>=n/2;i--)
        {
            System.out.print(a[i] + " ");
        }
    }
}
