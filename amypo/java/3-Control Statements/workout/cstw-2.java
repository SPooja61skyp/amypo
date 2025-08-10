import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = Integer.parseInt(n, 2);
        if (a < 0) {
            System.out.println("Invalid input");

        } else {
            System.out.println(a);
        }
    }
}