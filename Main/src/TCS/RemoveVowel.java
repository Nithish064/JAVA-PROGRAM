package Strings;

public class RemoveVowel {
    public static void main(String[] args) {
        String in = "hello world";

        String out = in.replaceAll("[aeiou]", "");

        System.out.println("Before : " + in);
        System.out.println("After : " + out);
    }
}