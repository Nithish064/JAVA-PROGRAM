package Conversion;

public class NumberToWords {
    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] thousands = {
        "", "Thousand", "Million", "Billion"
    };

    public static void main(String[] args) {
        int number = 123456789; // Example number
        String words = convert(number);
        System.out.println("Number: " + number + " -> Words: " + words);
    }

    public static String convert(int number) {
        if (number == 0) {
            return "Zero";
        }

        StringBuilder words = new StringBuilder();

        int thousandCounter = 0;

        while (number > 0) {
            int part = number % 1000;
            if (part > 0) {
                String partInWords = convertPart(part);
                words.insert(0, partInWords + " " + thousands[thousandCounter] + " ");
            }
            number /= 1000;
            thousandCounter++;
        }

        return words.toString().trim();
    }

    private static String convertPart(int number) {
        StringBuilder words = new StringBuilder();

        if (number >= 100) {
            words.append(units[number / 100]).append(" Hundred ");
            number %= 100;
        }

        if (number >= 20) {
            words.append(tens[number / 10]).append(" ");
            number %= 10;
        }

        if (number > 0) {
            words.append(units[number]).append(" ");
        }

        return words.toString();
    }
}