package TCS;

public class RemoveSpace {
    public static void main(String[] args) {
        String in = "hello world !";

        String out = in.replaceAll("\\s+", "");


        System.out.println("Output String : " + out);
    }
}
