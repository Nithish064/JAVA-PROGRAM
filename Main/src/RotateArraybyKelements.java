public class RotateArraybyKelements {
    
    
    static void reverse(int[] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] arr, int n, int k)
    {
        k = k % n;

        reverse(arr, 0, n-1);

        reverse(arr, 0, k-1);

        reverse(arr, k, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 2;
        
        rotate(arr, k , n);

        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
