import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int input = scanner.nextInt();
            System.out.println(input);
        } catch (InputMismatchException e) {
            System.out.println("-1");
        }
    }
}