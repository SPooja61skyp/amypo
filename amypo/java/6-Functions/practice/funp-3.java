import java.util.Scanner;

public class A {
    static boolean isAutomorphic(int num) {
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10)
                return false;
            num = num / 10;
            square = square / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();

            if (a < 0) {
                System.out.println("Invalid input");
                return;
            } else {
                if (isAutomorphic(a))
                    System.out.println(a + " is an Automorphic number");
                else
                    System.out.println(a + " is not an Automorphic number");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}