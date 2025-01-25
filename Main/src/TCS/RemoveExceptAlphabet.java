package TCS;

public class RemoveExceptAlphabet {
    public static void main(String[] args) {
        String str = "hello world ! 123";

        String str1 = str.replaceAll("[^a-zA-Z]", "");

        System.out.println("Output : " + str1);
    }
}
