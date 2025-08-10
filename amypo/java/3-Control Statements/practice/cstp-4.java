import java.util.Scanner;

public class SmallestPrimeFactor {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int findSmallestPrimeFactor(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return 0; // No prime factors found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(findSmallestPrimeFactor(n));
        }
       }
}