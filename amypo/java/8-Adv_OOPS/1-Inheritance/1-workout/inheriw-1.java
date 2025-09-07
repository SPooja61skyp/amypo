
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        n = sc.nextInt();
        if (n < 1 || n > 20) {
            System.out.println("Invalid input");
            return;
        }
        sc.nextLine();
        int totalCalories = 0;
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            if (parts.length != 3) {
                System.out.println("Invalid input");
                return;
            }
            String type = parts[0];
            int quantity, calories;
            try {
                quantity = Integer.parseInt(parts[1]);
                calories = Integer.parseInt(parts[2]);
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }
            if (!type.equals("Fruit") && !type.equals("Vegetable") && !type.equals("Dairy")) {
                System.out.println("Invalid input");
                return;
            }
            if (quantity < 0 || calories < 0) {
                System.out.println(-1);
                return;
            }
            if (quantity < -10000 || quantity > 10000 || calories < -10000 || calories > 10000) {
                System.out.println("Invalid input");
                return;
            }
            totalCalories += quantity * calories;
        }
        System.out.println(totalCalories);
        sc.close();
    }
}