import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println(-1);
            } else {
                int count = 0;
                int currentNumber = -1;
                while (count < n) {
                    currentNumber++;
                    int lastDigit = currentNumber % 10;
                    if (lastDigit >= 0 && lastDigit <= 5) {
                        count++;
                    }
                }
                System.out.println(currentNumber);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}