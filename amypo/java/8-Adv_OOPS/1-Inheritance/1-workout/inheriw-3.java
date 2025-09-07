import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int n = sc.nextInt();
        if (n < 1 || n > 20) {
            System.out.println("Invalid input");
            return;
        }
        sc.nextLine();
        double[] finalPrices = new double[n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] arr = line.split("\\s+");
            if (arr.length != 3) {
                System.out.println("Invalid input");
                return;
            }
            String type = arr[0];
            double initialPrice, discount;
            try {
                initialPrice = Double.parseDouble(arr[1]);
                discount = Double.parseDouble(arr[2]);
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }
            if (!type.equals("ProductSale") && !type.equals("ClearanceSale") && !type.equals("SeasonalSale")) {
                System.out.println("Invalid input");
                return;
            }
            if (initialPrice < 0 || initialPrice > 10000 || discount < 0 || discount > 100) {
                System.out.println("Invalid input");
                return;
            }
            finalPrices[i] = initialPrice - (initialPrice * discount / 100.0);
        }
        for (double price : finalPrices) {
            System.out.printf("%.1f\n", price);
        }
        sc.close();
    }
}