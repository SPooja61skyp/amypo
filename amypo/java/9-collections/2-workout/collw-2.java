import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.length() < 2) {
            System.out.println("Invalid input");
            return;
        }

        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scanner.close();
    }
}