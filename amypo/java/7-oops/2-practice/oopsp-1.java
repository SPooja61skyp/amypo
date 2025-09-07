import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        double percentage = 0.0;
        if (n == 0 || prices[0] == 0) { 
            percentage = 0.0;
        } else {
            percentage = ((double)maxProfit / prices[0]) * 100;
        }
        System.out.println(maxProfit);
        System.out.printf("%.2f\n", percentage);
        sc.close();
    }
}
