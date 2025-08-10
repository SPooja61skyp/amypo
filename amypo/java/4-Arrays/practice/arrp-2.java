import java.util.Scanner;

public class paliamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ispalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                ispalindrome = false;
                break;
            }
        }
        if (ispalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}