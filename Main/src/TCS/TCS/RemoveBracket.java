package TCS;

public class RemoveBracket {
    public static void main(String[] args) {
        String in = "(a + b) + (a - b)";

        String out = in.replaceAll("[()]", "");

        System.out.println("Output : " + out);
    }
}
