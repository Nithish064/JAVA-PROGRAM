import java.util.Scanner;

/*
    1. for loop to reverse the string

    The loop runs from the end to the beginning of the string.
    The charAt() method accesses each character of the string.
    Each character of the string is accessed in reverse order and stored in reverseStr.

    2. if statement to compare str and reverseStr

    The toLowerCase() method converts both str and reverseStr to lowercase. This is because Java is case sensitive and 'r' and 'R' are two different values.
    The equals() method checks if two strings are equal.
 */

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String RevStr = "";

        int StrLength = str.length();

        for(int i = (StrLength - 1); i >= 0; i--) {
            RevStr = RevStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(RevStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome");
        }
        else {
            System.out.println(str + " not a palindrome");
        }
    }
}
