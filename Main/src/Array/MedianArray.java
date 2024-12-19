package Array;
import java.util.Arrays;

public class MedianArray {

    static void getMedian(int[] arr, int n)
    {
        Arrays.sort(arr);

        if(n % 2 == 0)
        {
            int idx1 = (n/2) - 1;
            int idx2 = (n/2);
            System.out.println((double)arr[(idx1 + idx2) / 2]);
        }
        else{
            System.out.println(arr[(n/2)]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,6};

        int n = arr.length;

        System.out.println("Median of the array : ");
        getMedian(arr, n);
    }
}
