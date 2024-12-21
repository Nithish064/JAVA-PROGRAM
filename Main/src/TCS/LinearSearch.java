package Sorting;
public class LinearSearch {
    public static void main(String args[])
    {
        int[] arr = {12,34,23,6,8,5,3};
        int target = 0;
        int ans = linearsearch(arr, target);
        if(ans == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at the index of " + ans);
        }
    }
    static int linearsearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
