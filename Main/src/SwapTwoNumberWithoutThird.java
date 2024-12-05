import java.util.Scanner;

public class SwapTwoNumberWithoutThird {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        System.out.println("x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x + " y = " + y);
    }
}
