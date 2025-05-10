package TCS;
import java.util.Scanner;

public class Factorial {
    public static long Factorialnum(int num) {
        long fact = 1;
        for(int i =1;i<num;i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        long ans = Factorialnum(num);
        
        System.out.println(num + " factorial is " + ans);
    }
}