import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String journeyType = sc.nextLine().trim();
        double distance = sc.nextDouble();
        double speed = sc.nextDouble();
        int trafficFactor = 0;
        if (journeyType.equals("Car")) trafficFactor = 10;
        else if (journeyType.equals("Bike")) trafficFactor = 20;
        else if (journeyType.equals("Train")) trafficFactor = 5;
        else {
            System.out.println("Invalid input");
            return;
        }
        if (speed <= 0 || distance < 0) {
            System.out.println("-1");
            return;
        }
        double time = (distance / speed) * (1 + (double)trafficFactor / 100);
        System.out.printf("%.2f\n", time);
        sc.close();
    }
}