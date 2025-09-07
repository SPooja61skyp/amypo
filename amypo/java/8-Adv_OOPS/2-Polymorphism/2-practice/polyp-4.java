import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        if (limit < 0) {
            System.out.println("Invalid input");
            return;
        }
        int count = 0;
        for (int i = 1; i <= limit; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length() - 1; j++) {
                int d1 = s.charAt(j) - '0';
                int d2 = s.charAt(j + 1) - '0';
                if (d1 % 2 == 0 && d2 % 2 == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}