public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int temp;

        System.out.println("Before Swap");
        System.out.println(x);
        System.out.println(y);

        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swap");
        System.out.println(x);
        System.out.println(y);
    }
}
