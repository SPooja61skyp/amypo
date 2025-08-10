import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0 || a > 1000) {
            System.out.println("Invalid input");
            return;
        }

        try {
            int count = 0;
            for (int i = 0; i < a; i++) {
                int num = sc.nextInt();
                if (num < 0)
                    count++;
            }
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}