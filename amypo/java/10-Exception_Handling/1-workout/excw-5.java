import java.util.*;

class BudgetCalc {
    public static void divide(int income, int expense) {
        if (expense == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println((double) income / expense);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int income = sc.nextInt();
            int expense = sc.nextInt();
            if (expense < 0 || income < 0) {
                System.out.println("Invalid input");
                return;
            }
            BudgetCalc.divide(income, expense);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}