import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains("-")) {
            System.out.println("Invalid input");
            return;
        }
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                cleaned.append(c);
        }
        System.out.println(cleaned.toString());
        sc.close();
    }
}