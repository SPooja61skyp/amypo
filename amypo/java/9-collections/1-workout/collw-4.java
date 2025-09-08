import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input");
                return;
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            if (n == 1) {
                System.out.println(list.get(0));
                return;
            }

            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (!list.get(i).equals(list.get(0))) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("-1");
                return;
            }

            List<Integer> leaders = new ArrayList<>();
            int maxFromRight = Integer.MIN_VALUE;

            for (int i = n - 1; i >= 0; i--) {
                if (list.get(i) >= maxFromRight) {
                    leaders.add(list.get(i));
                    maxFromRight = list.get(i);
                }
            }

            Collections.reverse(leaders);

            for (int i = 0; i < leaders.size(); i++) {
                System.out.print(leaders.get(i));
                if (i < leaders.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}