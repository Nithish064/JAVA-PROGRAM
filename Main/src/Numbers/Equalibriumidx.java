package Numbers;
public class Equalibriumidx {
//     Example 1:
// Input: nums = [2,3,-1,8,4]
// Output: 3
// Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
// The sum of the numbers after index 3 is: 4 = 4

    static int FindIdx(int[] arr, int n)
    {
        int leftSum, rightSum;

        
        for(int i = 0;i<n;i++)
        {
            leftSum = 0;
            for(int j = 0; j<i; j++)
            {
                leftSum += arr[j];
            }

            rightSum = 0;
            for(int j = i+1;j<n;j++)
            {
                rightSum += arr[j];
            }

            if(leftSum == rightSum)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,-1,8,4};
        int n = arr.length;

        int ans = FindIdx(arr, n);
        System.out.println(ans + " ");
    }
}
