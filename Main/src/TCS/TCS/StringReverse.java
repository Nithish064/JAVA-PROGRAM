package TCS;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch;
        String reverse = "";

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
        
    }
}
