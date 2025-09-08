import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n1 = sc.nextInt();
            Set<Integer> set1 = new TreeSet<>();
            for (int i = 0; i < n1; i++) {
                set1.add(sc.nextInt());
            }

            int n2 = sc.nextInt();
            Set<Integer> set2 = new TreeSet<>();
            for (int i = 0; i < n2; i++) {
                set2.add(sc.nextInt());
            }

            set1.retainAll(set2);

            if (set1.isEmpty()) {
                System.out.println("No common elements");
            } else {
                for (int num : set1) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("No common elements");
        } finally {
            sc.close();
        }
    }
}