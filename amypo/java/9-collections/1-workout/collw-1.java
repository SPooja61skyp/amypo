import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();

            if (n < 0 || m < 0) {
                System.out.println("Invalid input");
                return;
            }

            Set<Integer> set1 = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                set1.add(sc.nextInt());
            }

            Set<Integer> set2 = new TreeSet<>();
            for (int i = 0; i < m; i++) {
                set2.add(sc.nextInt());
            }

            Set<Integer> union = new TreeSet<>(set1);
            union.addAll(set2);
            for (int num : union) {
                System.out.print(num + " ");
            }
            System.out.println();

            Set<Integer> difference = new TreeSet<>(set1);
            difference.removeAll(set2);
            for (int num : difference) {
                System.out.print(num + " ");
            }
            System.out.println();

            Set<Integer> intersection = new TreeSet<>(set1);
            intersection.retainAll(set2);
            for (int num : intersection) {
                System.out.print(num + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}
