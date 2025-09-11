import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        if (l <= 0 || w <= 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(l * w);
        }
    }
}