package Strings;

public class Capitalize {
    public static void main(String[] args) {
        String str = "hello world";

        String str1 = CapitalizeFirst(str);

        System.out.println("Output : " + str1);
    }

    static String CapitalizeFirst(String str)
    {
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words)
        {
            if(word.length() > 0)
            {
                char first = Character.toUpperCase(word.charAt(0));
                char last = Character.toUpperCase(word.charAt(word.length()-1));

                if (word.length() == 1)
                {
                    result.append(first);
                }
                else {
                    result.append(first);
                    result.append(word.substring(1, word.length()-1));
                    result.append(last);
                }
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
