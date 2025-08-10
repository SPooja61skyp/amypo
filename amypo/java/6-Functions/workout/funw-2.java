import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x < 0 || y < 0) {
            System.out.println("Invalid input");
        } else {
            int result = (int) Math.pow(x, y);
            System.out.println(result);
        }
    }
}