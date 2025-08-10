import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid input");
            return;
        }

        int position = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, position);
            position++;
            n /= 10;
        }

        System.out.println((int) sum);
    }
}