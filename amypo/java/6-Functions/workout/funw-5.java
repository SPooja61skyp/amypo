import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a <= 0 || b <= 0) {
                System.out.println("Invalid input");
                return;
            }

            int gcdValue = gcd(a, b);
            long lcmValue = ((long) a * b) / gcdValue;
            System.out.println(lcmValue);

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        sc.close();
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}