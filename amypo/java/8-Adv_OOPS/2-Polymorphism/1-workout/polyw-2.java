import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        int year;
        try {
            year = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }
        if (year < 0) {
            System.out.println("-1");
            return;
        }
        int day = 13, month = 9;
        if (year == 1918) {
            day = 26;
        } else if (year < 1918) {
            // Julian leap year if divisible by 4
            if (year % 4 == 0)
                day = 12;
        } else {
            // Gregorian leap year: divisible by 400 or (divisible by 4 and not by 100)
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                day = 12;
        }
        System.out.printf("%02d.%02d.%d\n", day, month, year);
        sc.close();
    }
}