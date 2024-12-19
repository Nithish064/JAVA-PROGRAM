package Array;
public class insertAtPosition {


    static void InsertAtPosition(int[] arr, int n, int pos, int value)
    {
        for(int i = n; i>=pos;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos-1] = value;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,0};
        int n = 8;
        int value = 40;
        int pos = 5;
        InsertAtPosition(arr,n,pos,value);
        System.out.println("Insert At Position in Array : ");
        for(int i = 0;i<=n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
