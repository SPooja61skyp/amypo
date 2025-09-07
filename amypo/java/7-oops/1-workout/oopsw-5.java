import java.util.Scanner;

public class Editor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0 || n < -1000 || n > 1000) {
                System.out.println("Invalid input");
                return;
            }
            int square = n * n;
            String nStr = Integer.toString(n);
            String squareStr = Integer.toString(square);

            if (squareStr.endsWith(nStr)) {
                System.out.println(n + " is an Automorphic number");
            } else {
                System.out.println(n + " is not an Automorphic number");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}