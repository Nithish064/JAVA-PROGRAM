package Strings;

public class CountVowelConsonent {
    public static void main(String[] args) {
        String str = "green is the color";

        int len = str.length();

        int v=0,c=0,s=0;

        for(int i = 0; i<len; i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                v++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                c++;
            }
            else if(ch == ' ')
            {
                s++;
            }
        }
        System.out.println("Vowels Count : " + v);
        System.out.println("Consonent Count : " + c);
        System.out.println("WhiteSpaces Count : "+ s);
    }
}