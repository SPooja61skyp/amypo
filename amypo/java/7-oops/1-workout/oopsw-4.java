import java.util.Scanner;

public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int hoursParked = sc.nextInt();
            float hourlyRate = sc.nextFloat();

            if (hoursParked < 0 || hoursParked > 24 || hourlyRate < 0 || hourlyRate > 10) {
                System.out.println("Invalid input");
                return;
            }

            float totalFee = hoursParked * hourlyRate;
            System.out.printf("%.2f\n", totalFee);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}