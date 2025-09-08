import java.util.Scanner;

public class LoanInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double loanAmount = sc.nextDouble();
            sc.nextLine(); 
            String loanType = sc.nextLine();

            if (loanAmount <= 0) {
                System.out.println("Invalid input");
                return;
            }

            double interestRate;
            if (loanType.equalsIgnoreCase("HomeLoan")) {
                interestRate = 0.05;
            } else if (loanType.equalsIgnoreCase("PersonalLoan")) {
                interestRate = 0.10;
            } else {
                System.out.println("Invalid input");
                return;
            }
            
            double interest = loanAmount * interestRate;
            System.out.printf("%.1f%n", interest);

        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}