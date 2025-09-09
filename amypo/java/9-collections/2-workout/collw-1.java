import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Invalid input");
                return;
            }

            Map<String, Integer> data = new HashMap<>();
            Set<Integer> values = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String[] parts = scanner.nextLine().split(" ");
                String key = parts[0];
                int value = Integer.parseInt(parts[1]);
                data.put(key, value);
                values.add(value);
            }

            if (values.size() == 1) {
                System.out.println("-1");
                return;
            }

            List<Map.Entry<String, Integer>> sortedData = new ArrayList<>(data.entrySet());
            sortedData.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

            for (Map.Entry<String, Integer> entry : sortedData) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}