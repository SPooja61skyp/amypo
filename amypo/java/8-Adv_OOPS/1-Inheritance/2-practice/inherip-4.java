import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalWork = sc.nextDouble();
        double individualWorkRate = sc.nextDouble();
        int numberOfWorkers = sc.nextInt();
        double workRatePerWorker = sc.nextDouble();
        double individualDays = totalWork / individualWorkRate;
        double groupDays = totalWork / (numberOfWorkers * workRatePerWorker);
        System.out.println((int) individualDays);
        System.out.println((int) groupDays);
        sc.close();
    }
}