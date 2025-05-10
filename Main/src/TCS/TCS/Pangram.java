package TCS;
import java.util.*;

public class Pangram {
    static boolean checkIfPangram(String sentence) {

        Set<Character> alphabetSet = new HashSet<>();
    
        // Add all characters from 'a' to 'z' in hashset
        for (int i = 'a'; i <= 'z'; i++) {
          alphabetSet.add((char) i);
        }
    
        // Remove every character and check
        // if set becomes empty at any point of time
        for (int i = 0; i < sentence.length(); i++) {
          alphabetSet.remove(sentence.charAt(i));
          if (alphabetSet.isEmpty())
            return true;
        }
    
        return false;
      }
    
    public static void main(String[] args) {
        String x = "THE BROWN FOX QUICK JUMPS OVER A LAZY DOG";
        
        if(checkIfPangram(x))
        {
            System.out.println("Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }

        /*x = x.replace(" ", "");

        char y[] = x.toCharArray();
        int size = y.length;

        int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int i = 0;
        while(i!=size)
        {
            int index = y[i]-65;
            a[index] = 1;
            ++i;
        }

        i = 0;
        while(i != 26)
        {
            if(a[i] == 1)
            {
                ++i;
            }
            else{
                System.out.println("Not Pangram");
                break;
            }
        }
        System.out.println("Pangram");
        */
    }
}
