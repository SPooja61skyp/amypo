import java.util.Scanner;

public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n < 1 || n > 10000) {
                System.out.println("Invalid input");
                return;
            }
            int[] arr = new int[n];
            int totalSum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < -10000 || arr[i] > 10000) {
                    System.out.println("Invalid input");
                    return;
                }
                totalSum += arr[i];
            }
            int leftSum = 0;
            for (int i = 0; i < n; i++) {
                totalSum -= arr[i];
                if (leftSum == totalSum) {
                    System.out.println(i);
                    return;
                }
                leftSum += arr[i];
            }
            System.out.println(-1);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}