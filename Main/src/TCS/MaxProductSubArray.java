package TCS;
public class MaxProductSubArray {

    static int MaxProduct(int[] arr)
    {
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i] < 0)
            {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct*arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);


            result = Math.max(result,maxProduct);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};
        int ans = MaxProduct(arr);
        System.out.println("Maximum Product : " + ans);
    }
}
