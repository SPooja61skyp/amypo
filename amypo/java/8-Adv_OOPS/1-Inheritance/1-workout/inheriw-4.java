import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalWork = sc.nextDouble();
        double individualWorkRate = sc.nextDouble();
        int numberOfWorkers = sc.nextInt();
        double workRatePerWorker = sc.nextDouble();

        if (totalWork <= 0) {
            System.out.println("Invalid input");
            return;
        }

        if (individualWorkRate <= 0) {
            System.out.println(-1);
        } else {
            double timeIndividual = totalWork / individualWorkRate;
            System.out.println(timeIndividual);
        }
        if (numberOfWorkers <= 0 || workRatePerWorker <= 0) {
            System.out.println(-1);
        } else {
            double groupRate = numberOfWorkers * workRatePerWorker;
            double timeGroup = totalWork / groupRate;
            System.out.println(timeGroup);
        }

        sc.close();
    }
}