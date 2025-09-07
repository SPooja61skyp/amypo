import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine().trim()); // number of appliances
            if (n <= 0) {
                System.out.println("Invalid input");
                return;
            }

            List<Double> results = new ArrayList<>();
            boolean invalid = false;

            for (int i = 0; i < n; i++) {
                if (!sc.hasNextLine()) {
                    invalid = true;
                    break;
                }
                String[] parts = sc.nextLine().trim().split("\\s+");
                if (parts.length != 3) {
                    invalid = true;
                    break;
                }

                String type = parts[0];
                int power, hours;
                try {
                    power = Integer.parseInt(parts[1]);
                    hours = Integer.parseInt(parts[2]);
                } catch (NumberFormatException e) {
                    invalid = true;
                    break;
                }

                if (power <= 0 || hours <= 0) {
                    invalid = true;
                    break;
                }

                double multiplier;
                if (type.equals("WashingMachine"))
                    multiplier = 1.0;
                else if (type.equals("Refrigerator"))
                    multiplier = 0.8;
                else if (type.equals("AirConditioner"))
                    multiplier = 1.5;
                else {
                    invalid = true;
                    break;
                }

                results.add(power * hours * multiplier);
            }

            if (invalid) {
                System.out.println("Invalid input");
                return;
            }

            for (double v : results) {
                System.out.printf("%.2f%n", v);
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}