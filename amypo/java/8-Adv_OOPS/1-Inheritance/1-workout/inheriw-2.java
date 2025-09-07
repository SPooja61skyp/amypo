import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine().trim();
        if (!type.equals("Undergraduate") && !type.equals("Postgraduate")) {
            System.out.println("Invalid input");
            return;
        }
        String name = sc.nextLine().trim();
        String idStr = sc.nextLine().trim();
        int id;
        try {
            id = Integer.parseInt(idStr);
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }
        String gradesStr = sc.nextLine().trim();
        int gradesCount;
        try {
            gradesCount = Integer.parseInt(gradesStr);
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }
        int total = 0;
        for (int i = 0; i < gradesCount; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                return;
            }
            int grade = sc.nextInt();
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid input");
                return;
            }
            total += grade;
        }
        double avg = (double) total / gradesCount;
        System.out.printf("%.2f\n", avg);
        sc.close();
    }
}