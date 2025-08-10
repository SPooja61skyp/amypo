import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextFloat()) {
            float r = sc.nextFloat();
            if (r < 0) {
                System.out.println("Invalid input");
            } else {
                double result = 3.141592 * r * r;
                System.out.printf("%.2f", result);
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}