import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {
            int val = i * i;
            for (int j = 1; j <= n; j++) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}