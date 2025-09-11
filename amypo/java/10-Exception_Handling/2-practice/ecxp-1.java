
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            if (n < 0|| n > 12) {
                System.out.println("Invalid input");
                return;
            }
            int totalSavings = 0;
            for (int i = 0; i < n; i++) {
                int deposit = scanner.nextInt();
                if (deposit < 0 || deposit < -1000 || deposit > 1000) {
                    System.out.println("Invalid input");
                    return;
                }
                totalSavings += deposit;
            }
            System.out.println(totalSavings);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}