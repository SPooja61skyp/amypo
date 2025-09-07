import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        double bitcoinBalance = 0.0;
        double creditBalance = 0.0;
        double paypalBalance = 0.0;

        for (int i = 0; i < t; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");

            if (parts.length != 3) {
                System.out.println("Invalid input");
                return;
            }

            String walletType = parts[0];
            String transactionType = parts[1];
            double amount;

            try {
                amount = Double.parseDouble(parts[2]);
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }

            if (amount < 0) {
                System.out.println(-1);
                return;
            }

            if (!(walletType.equals("BitcoinWallet") ||
                    walletType.equals("CreditCardWallet") ||
                    walletType.equals("PayPalWallet"))) {
                System.out.println("Invalid input");
                return;
            }

            if (!(transactionType.equals("add") || transactionType.equals("pay"))) {
                System.out.println("Invalid input");
                return;
            }

            if (walletType.equals("BitcoinWallet")) {
                if (transactionType.equals("add"))
                    bitcoinBalance += amount;
                else
                    bitcoinBalance -= amount;
            } else if (walletType.equals("CreditCardWallet")) {
                if (transactionType.equals("add"))
                    creditBalance += amount;
                else
                    creditBalance -= amount;
            } else if (walletType.equals("PayPalWallet")) {
                if (transactionType.equals("add"))
                    paypalBalance += amount;
                else
                    paypalBalance -= amount;
            }
        }

        System.out.printf("%.2f%n", bitcoinBalance);
        System.out.printf("%.2f%n", creditBalance);
        System.out.printf("%.2f%n", paypalBalance);

        sc.close();
    }
}