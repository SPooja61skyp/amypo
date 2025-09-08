import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (n1 < 0 || n2 < 0) {
                System.out.println("Invalid input");
                return;
            }

            List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < n1; i++) {
                list1.add(sc.nextInt());
            }

            Set<Integer> set2 = new HashSet<>();
            for (int i = 0; i < n2; i++) {
                set2.add(sc.nextInt());
            }

            list1.removeAll(set2);

            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i));
                if (i < list1.size() - 1) {
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