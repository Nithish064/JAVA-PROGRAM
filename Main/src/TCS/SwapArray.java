package TCS;
import java.util.*;

public class SwapArray 
{
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6};
        Swap(a,1,4);

        System.out.println(Arrays.toString(a));
    }

    static void Swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}