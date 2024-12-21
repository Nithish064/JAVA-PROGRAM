package TCS;
import java.util.Arrays;

public class Anagram 
{
    public static void main(String[] args) {
        String x = "he is listen".trim();
        String y = "is he silent".trim();

        char a[] = x.toCharArray();
        char b[] = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean found = Arrays.equals(a,b);

        if(found == true)
        {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}