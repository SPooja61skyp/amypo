import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int n = sc.nextInt();
        if (n < 1 || n > 3) {
            System.out.println("Invalid input");
            return;
        }
        double[] dims = new double[n];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input");
                return;
            }
            dims[i] = sc.nextDouble();
            if (dims[i] <= 0) {
                System.out.println("Invalid input");
                return;
            }
        }
        if (n == 1) {
            System.out.println("Circle");
        } else if (n == 2) {
            if (dims[0] == dims[1])
                System.out.println("Square");
            else
                System.out.println("Rectangle");
        } else if (n == 3) {
            if (dims[0] == dims[1] && dims[1] == dims[2])
                System.out.println("Cube");
            else
                System.out.println("Triangle");
        }
        sc.close();
    }
}