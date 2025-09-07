import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vehicleType = sc.nextLine().trim().toLowerCase();
        float rentalDays = Float.parseFloat(sc.nextLine().trim());
        float pricePerDay = Float.parseFloat(sc.nextLine().trim());

        if ((!vehicleType.equals("car") && !vehicleType.equals("bike")) || rentalDays <= 0 || pricePerDay <= 0) {
            System.out.println("Invalid input");
        } else {
            float total = rentalDays * pricePerDay;
            System.out.printf("$%.2f\n", total);
        }
    }
}