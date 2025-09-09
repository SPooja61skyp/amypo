import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input");
                scanner.close();
                return;
            }
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Invalid input");
                scanner.close();
                return;
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input");
                    scanner.close();
                    return;
                }
                int height = scanner.nextInt();
                if (height % 2 == 0) {
                    sum += height;
                }
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}