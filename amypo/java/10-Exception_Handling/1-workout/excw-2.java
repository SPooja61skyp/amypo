import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ph = scanner.nextDouble();
        if (ph < 0 || ph > 14) {
            System.out.println("Invalid input");
        } else if (ph < 7) {
            System.out.println("Acidic");
        } else if (ph > 7) {
            System.out.println("Basic");
        } else {
            System.out.println("Neutral");
        }
    }
}