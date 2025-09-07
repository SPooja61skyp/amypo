import java.util.Scanner;

public class Editor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long min = (long) -Math.pow(2, 31);
            long max = (long) Math.pow(2, 31) - 1;

            if (a < min || a > max || b < min || b > max) {
                System.out.println("Invalid input");
                return;
            }

            long sum = a + b;
            if (sum < min || sum > max) {
                System.out.println("Overflow detected");
            } else {
                System.out.println(sum);
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}