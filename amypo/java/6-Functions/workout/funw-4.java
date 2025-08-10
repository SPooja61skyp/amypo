
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int num1 = sc.nextInt();

            long num2 = sc.nextLong();

            checkAutomorphic(num1);
            checkAutomorphic(num2);

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        sc.close();
    }

    public static void checkAutomorphic(long num) {
        long absNum = Math.abs(num);
        long square = absNum * absNum;

        String numStr = String.valueOf(absNum);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }
}