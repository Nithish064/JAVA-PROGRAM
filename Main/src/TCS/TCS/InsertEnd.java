package TCS;
public class InsertEnd {
    
    static void InsertEnd(int[] arr, int n, int value)
        {
            arr[n] = value;
        }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,0};
        int n = 8;
        int value = 40;

        InsertEnd(arr,n,value);
        System.out.println("Insert at End of Array: ");
        for(int i = 0; i<=n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
