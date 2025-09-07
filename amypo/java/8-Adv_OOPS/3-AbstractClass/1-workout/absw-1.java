import java.util.*;

abstract class Transaction {
    abstract double execute(double balance, double amount);
}

class Deposit extends Transaction {
    double execute(double balance, double amount) {
        if (amount < 0) return -1;
        return balance + amount;
    }
}

class Withdraw extends Transaction {
    double execute(double balance, double amount) {
        if (amount < 0 || amount > balance) return -1;
        return balance - amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine().trim().toLowerCase();
        double amount = Double.parseDouble(sc.nextLine().trim());
        int acc = Integer.parseInt(sc.nextLine().trim());
        double balance = 1000.0;
        Transaction t;
        if (type.equals("deposit")) {
            t = new Deposit();
        } else if (type.equals("withdraw")) {
            t = new Withdraw();
        } else {
            System.out.println("Invalid input");
            return;
        }
        double newBalance = t.execute(balance, amount);
        if (newBalance < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(newBalance);
        }
    }
}