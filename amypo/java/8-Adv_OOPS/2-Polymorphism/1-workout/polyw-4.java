import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        if (s.startsWith("-")) {
            System.out.println(-1);
            return;
        }

        Set<Character> valid = new HashSet<>(Arrays.asList('I', 'V', 'X', 'L', 'C', 'D', 'M'));

        // Vali
        for (char c : s.toCharArray()) {
            if (!valid.contains(c)) {
                System.out.println("Invalid input");
                return;
            }
        }

        // Map Roman symbols to values
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;
        int i = 0;

        while (i < s.length()) {
            int value1 = roman.get(s.charAt(i));

            if (i + 1 < s.length()) {
                int value2 = roman.get(s.charAt(i + 1));
                if (value1 < value2) {
                    result += (value2 - value1);
                    i += 2;
                } else {
                    result += value1;
                    i++;
                }
            } else {
                result += value1;
                i++;
            }
        }

        System.out.println(result);
    }
}