
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n < 1 || n > 100) {
                System.out.println("Invalid input");
                return;
            }
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
                if (arr[i].length() < 1 || arr[i].length() > 10 || !arr[i].matches("[a-z]+")) {
                    System.out.println("Invalid input");
                    return;
                }
            }
            int maxLen = -1;
            for (int i = 0; i < n; i++) {
                int len = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j].equals(arr[j - 1])) break;
                    len++;
                }
                if (len > maxLen) {
                    maxLen = len;
                }
            }
            System.out.println(maxLen > 1 ? maxLen : -1);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
