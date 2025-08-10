import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Invalid input");
        }
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}