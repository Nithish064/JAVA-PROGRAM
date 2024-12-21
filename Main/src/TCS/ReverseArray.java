package Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6};
        
        reverse(a);

        System.out.println(Arrays.toString(a));
    }

    static void reverse(int[] a)
    {
        int s = 0;
        int e = a.length-1;

        while(s < e)
        {
            Swap(a,s,e);
            s++;
            e--;
        }
    }

    static void Swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
