import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.println("Invalid input");
                return;
            }

            Map<String, Integer> map1 = new HashMap<>();
            for (int i = 0; i < m; i++) {
                String[] parts = scanner.nextLine().split(" ");
                map1.put(parts[0], Integer.parseInt(parts[1]));
            }

            int n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Invalid input");
                return;
            }

            Map<String, Integer> map2 = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String[] parts = scanner.nextLine().split(" ");
                map2.put(parts[0], Integer.parseInt(parts[1]));
            }

            if (map1.equals(map2)) {
                System.out.println("-1");
                return;
            }

            Map<String, Integer> mergedMap = new HashMap<>(map1);
            for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                mergedMap.put(entry.getKey(), entry.getValue());
            }

            for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}