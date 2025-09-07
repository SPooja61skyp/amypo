import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayOfWeek = sc.nextLine();
        int numberOfMembers = sc.nextInt();
        sc.nextLine();
        String foodDesired = sc.nextLine();

        if (numberOfMembers < 1) {
            System.out.println("-1");
            return;
        }

        double rate;
        if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday")) {
            rate = 2000;
        } else if (dayOfWeek.equalsIgnoreCase("Monday") || dayOfWeek.equalsIgnoreCase("Tuesday")
                || dayOfWeek.equalsIgnoreCase("Wednesday") || dayOfWeek.equalsIgnoreCase("Thursday")
                || dayOfWeek.equalsIgnoreCase("Friday")) {
            rate = 1000;
        } else {
            System.out.println("Invalid input");
            return;
        }

        double totalBill = rate * numberOfMembers;
        if (foodDesired.equalsIgnoreCase("yes")) {
            totalBill += 500 * numberOfMembers;
        }

        System.out.println((int) totalBill);
        sc.close();
    }
}