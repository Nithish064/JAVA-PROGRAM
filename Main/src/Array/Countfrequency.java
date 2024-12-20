package Array;
public class Countfrequency {
    
    public static void count(int[] a, int n)
    {
        boolean visited[] = new boolean[n];

        for(int i = 0; i<n; i++)
        {
            if(visited[i] == true)
            {
                continue;
            }

            int count = 1;
            for(int j = i+1; j<n; j++)
            {
                if(a[i] == a[j])
                {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(a[i] + " is occured in " + count + " times");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,5,6};

        int n = arr.length;

        count(arr, n);
    }
}