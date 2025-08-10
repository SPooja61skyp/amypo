import java.util.*;

public class Main {
    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        if (M > N || M < 0 || N < 0) {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = M; i <= N; i++) {
            int reversed = reverse(i);
            int result;

            if (reversed < i)
                result = reversed * 2;
            else if (reversed > i)
                result = reversed - 1;
            else
                result = reversed + 10;

            System.out.print(result + " ");
        }
    }
}