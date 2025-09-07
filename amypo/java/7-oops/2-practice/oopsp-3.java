
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int accountNumber = sc.nextInt();
        if (!sc.hasNextFloat() && !sc.hasNextDouble()) {
            System.out.println("Invalid input");
            return;
        }
        double accountBalance = sc.nextDouble();
        if (accountNumber >= -500 && accountNumber <= 500
                && accountBalance >= 0 && accountBalance <= 1000.00) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
