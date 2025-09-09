import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        String[] tokens = inputLine.split(" ");
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (String token : tokens) {
            if (token.equals("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(token);
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                } else {
                    oddNumbers.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                return;
            }
        }

        // Print evens
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Collections.reverse(evenNumbers);
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Collections.reverse(oddNumbers);
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}