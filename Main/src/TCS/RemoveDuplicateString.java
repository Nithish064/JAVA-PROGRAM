package TCS;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "hello world";

        String str1 = RemoveDuplicate(str);

        System.out.println("Output : " + str1);
    }

    static String RemoveDuplicate(String str)
    {
        StringBuilder result = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char current = str.charAt(i);
            boolean duplicate = false;

            for(int j=0;j<result.length();j++)
            {
                if(str.charAt(j) == current)
                {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate)
            {
                result.append(current);
            }
        }
        return result.toString();
    }
}
