package Array;
import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("lowercase");
        }
        else
        {
            System.out.println("UpperCase");
        }
    }
}
