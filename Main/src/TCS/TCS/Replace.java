package TCS;
public class Replace {
    public static void main(String[] args) {
        int n = 10012200;

        String str = Integer.toString(n);

        String replaceStr = str.replace('0', '1');


        System.out.println(Integer.parseInt(replaceStr));
    }
}
