package TCS;
public class Sumofarray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        int sum = 0;

        for(int i =0; i<a.length;i++)
        {
            sum += a[i];
        }

        System.out.println("Sum : " + sum);
    }
}
