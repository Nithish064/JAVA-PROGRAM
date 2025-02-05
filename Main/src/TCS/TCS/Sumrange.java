package TCS;
public class Sumrange {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 12;

        int n = n2-n1 +1;

        int sum = (n * (n1+n2))/2; // (3 * (10+12) / 2)

        System.out.println("Answer : " + sum);
    }
}
