import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int width = sc.nextInt();
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int height = sc.nextInt();
        if (width <= 0 || height <= 0 || width < -1000 || width > 1000 || height < -1000 || height > 1000) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(width * height);
        sc.close();
    }
}
