import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int n = sc.nextInt();

        if (n < 1 || n > 15) {
            System.out.println("Invalid input");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                return;
            }
            arr[i] = sc.nextInt();
            if (arr[i] < 1 || arr[i] > 1000) {
                System.out.println("Invalid input");
                return;
            }
        }

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLen = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
            }
        }
        System.out.println(maxLen);
        sc.close();
    }
}
