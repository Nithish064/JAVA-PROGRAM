package TCS;
public class MaxMinDigit {
    public static void main(String[] args) {
        String n = "1278";

        char Max = n.charAt(0);
        char Min = n.charAt(0);

        for(int i = 0; i<n.length();i++)
        {
            char current = n.charAt(i);

            if(current > Max)
            {
                Max = current;
            }
            if(current < Min)
            {
                Min = current;
            }
        }

        System.out.println("Maxmum number in Digit : " + Max);
        System.out.println("Minimum number in Digit : " + Min);
    }
}
