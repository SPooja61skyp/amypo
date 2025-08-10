import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int n = sc.nextInt();
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int c = sc.nextInt();

        int[][] arr = new int[n][c];

        for (i = 0; i < n; i++) {
            for (j = 0; j < c; j++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input");
                    return;
                }
                arr[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < c; j++) {
                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}