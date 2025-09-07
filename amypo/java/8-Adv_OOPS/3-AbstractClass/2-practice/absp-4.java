import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemType = sc.next();

        if (!itemType.equalsIgnoreCase("Starter") && !itemType.equalsIgnoreCase("MainCourse")) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        float price = sc.nextFloat();
        int quantity = sc.nextInt();

        if (price <= 0 || price > 500 || quantity < 1 || quantity > 100) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        float totalCost = price * quantity;
        System.out.printf("%.1f%n", totalCost);

        sc.close();
    }
}