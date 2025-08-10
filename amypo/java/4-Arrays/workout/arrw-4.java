import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        if ((r < 0) || (c < 0)) {
            System.out.println("Invalid input");
        }
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int next = arr[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (arr[i][j] < next) {
                    next = arr[i][j];
                }
            }
        }
        System.out.println(next);
    }
}