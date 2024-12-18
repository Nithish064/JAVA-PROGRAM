public class AverageSumArray {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};

        int sum = 0;

        int length = 5;

        for(int i = 0; i<length; i++)
        {
            sum += (double)n[i];
        }
        double average = sum/length;

        System.out.println("Average of Sum : " + average);
    }
}
