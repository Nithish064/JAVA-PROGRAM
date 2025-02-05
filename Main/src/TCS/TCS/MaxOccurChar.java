package TCS;

public class MaxOccurChar {
    public static void main(String[] args) {
        String str = "hello world";

        char str1 = MaxOccur(str);

        System.out.println("Output : " + str1);
    }

    static char MaxOccur(String str)
    {
        char Maxchar = ' ';

        int max = 0;

        for(int i=0;i<str.length();i++)
        {
            char current = str.charAt(i);
            int c = 0;
            for(int j = 0;j<str.length();j++)
            {
                if(str.charAt(j) == current)
                {
                    c++;
                }
            }

            if(c > max)
            {
                max = c;
                Maxchar = current;
            }
        }
        return Maxchar;
    }
}