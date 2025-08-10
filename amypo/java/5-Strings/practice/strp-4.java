import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.matches("\\d+")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}