import java.util.*;

public class NumberToWords {
    static String[] belowTwenty = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    static String convert(int num) {
        if (num <= 0 || num > 9999)
            return "Invalid input";
        StringBuilder result = new StringBuilder();
        if (num >= 1000) {
            result.append(belowTwenty[num / 1000]).append(" thousand");
            num = num % 1000;
            if (num > 0)
                result.append(" ");
        }
        if (num >= 100) {
            result.append(belowTwenty[num / 100]).append(" hundred");
            num = num % 100;
            if (num > 0)
                result.append(" and ");
        }
        if (num >= 20) {
            result.append(tens[num / 10]);
            num = num % 10;
            if (num > 0)
                result.append(" ");
        }
        if (num > 0 && num < 20) {
            result.append(belowTwenty[num]);
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convert(num));
    }
}