import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double initialBalance = scanner.nextDouble();
            double amountToWithdraw = scanner.nextDouble();
            if (initialBalance < 0 || amountToWithdraw < 0) {
                System.out.println("Invalid input");
            } else if (amountToWithdraw > initialBalance) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}