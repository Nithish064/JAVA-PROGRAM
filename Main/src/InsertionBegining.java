

public class InsertionBegining {

    static void InsertBegin(int[] arr, int n, int value)
    {
        for(int i = n-1;i>=0;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = value;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,0};
        int n = 8;
        int value = 40;
        InsertBegin(arr,n,value);
        System.out.println("Insert in Begining in Array : ");
        for(int i = 0; i<n;i++)
        {
            System.out.print("[" + arr[i] + "]");
        }
    }
}
