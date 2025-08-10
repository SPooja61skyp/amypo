import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 0 && a < input.length()) {
            System.out.println((int) input.charAt(a));
        } else {
            System.out.println("Invalid input");
        }
        if (b >= 0 && b < input.length()) {
            System.out.println((int) input.charAt(b));
        } else {

            System.out.println("Invalid input");
        }

    }
}