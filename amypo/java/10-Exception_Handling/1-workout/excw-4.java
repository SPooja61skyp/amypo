import java.util.*;
import java.text.*;

// Custom Exception
class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputDate = sc.nextLine();
        
        try {
            validateDate(inputDate);
            System.out.println("Valid Date");
        } catch (InvalidDateFormatException e) {
            System.out.println("Invalid input");
        } catch (IllegalArgumentException e) {
            System.out.println("-1");
        }
    }

    public static void validateDate(String dateStr) throws InvalidDateFormatException {
        // Check MM/DD/YYYY format using regex
        if (!dateStr.matches("\\d{2}/\\d{2}/\\d{4}")) {
            throw new InvalidDateFormatException("Wrong format");
        }

        String[] parts = dateStr.split("/");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Validate using Calendar
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        try {
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month - 1); // Month is 0-based in Calendar
            cal.set(Calendar.DAY_OF_MONTH, day);
            cal.getTime(); // Will throw exception if invalid date
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date values");
        }
    }
}