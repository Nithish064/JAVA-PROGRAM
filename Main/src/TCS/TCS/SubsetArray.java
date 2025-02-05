package TCS;
public class SubsetArray {

    static boolean IsSub(int[] arr1, int[] arr2, int m, int n)
    {
        if(m > n) return false;

        for(int i=0; i<m; i++)
        {
            boolean present = false;
            for(int j=0; j<n; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    present = true;
                    break;
                }
            }
            if(present == false) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,8};
        int[] arr2 = {1,2,3,4,5,6};

        int m = arr1.length;
        int n = arr2.length;

        boolean ans = IsSub(arr1,arr2,m,n);

        if(ans == true)
        {
            System.out.println("arr1 is subset of arr2");
        }
        else
        {
            System.out.println("arr1 is not subset of arr2");
        }
    }
}
