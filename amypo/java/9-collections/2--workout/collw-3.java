import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Invalid input");
                return;
            }

            Map<String, Integer> treasureMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String[] parts = scanner.nextLine().split(" ");
                if (parts.length == 2) {
                    treasureMap.put(parts[0], Integer.parseInt(parts[1]));
                }
            }

            String keyToCheck = scanner.nextLine();
            if (treasureMap.containsKey(keyToCheck)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            scanner.close();
        }
    }
}