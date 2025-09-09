import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Invalid input");
            } else {
                Set<Integer> uniqueItems = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    uniqueItems.add(scanner.nextInt());
                }
                System.out.println(uniqueItems.size());
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}