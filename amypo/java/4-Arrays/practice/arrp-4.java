import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
        }
        int n = sc.nextInt();
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
        }
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input");
                }
                arr[i][j] = sc.nextInt();

            }
        }
        for (j = 0; j < m; j++) {
            int sum = 0;
            for (i = 0; i < n; i++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}