package TCS;

import java.util.regex.*;

public class SumOfStringInNum {
    public static void main(String[] args) {
        String str = "1 cat and 2 dogs";

        int sum = 0;

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find())
        {
            sum += Integer.parseInt(matcher.group());
        }
        System.out.println("Sum : " + sum);

    }
}
