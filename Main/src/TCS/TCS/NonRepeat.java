package TCS;

public class NonRepeat {
    public static void main(String[] args) {
        String in = "swiss";

        System.out.println("Output : " + NonRepeatCh(in));
    }

    static String NonRepeatCh(String str)
    {
        StringBuilder result = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char character = str.charAt(i);
            boolean repeat = false;

            for(int j=0;j<str.length();j++)
            {
                if(i != j && character == str.charAt(j))
                {
                    repeat = true;
                    break;
                }
            }
            if(!repeat)
            {
                result.append(character);
            }
        }
        return result.toString();
    }
}
