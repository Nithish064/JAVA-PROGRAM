package Numbers;
public class SumofAPSeries {
    public static void main(String[] args) {
        int a = 2;
        int d = 2;
        int n = 4;


        int ans = (n * (2 * a + (n - 1) * d)) / 2;
        System.out.println("The Sum Of The A.P Series : " + ans);
    }
}
