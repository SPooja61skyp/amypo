
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int next = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > next) {
                next = arr[i];
            }
        }

        System.out.println(next);
    }
}