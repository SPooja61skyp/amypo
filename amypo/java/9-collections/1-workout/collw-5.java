import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            if (!sc.hasNextLine()) {
                System.out.println("Sublist not found");
                return;
            }
            String sublistStr = sc.nextLine().trim();
            if (!sc.hasNextLine()) {
                System.out.println("Sublist not found");
                return;
            }
            String mainlistStr = sc.nextLine().trim();

            if (sublistStr.isEmpty() || mainlistStr.isEmpty()) {
                System.out.println("Sublist not found");
                return;
            }

            String[] sublistArr = sublistStr.split("\\s+");
            String[] mainlistArr = mainlistStr.split("\\s+");

            // If either sublist OR mainlist has all elements the same, print -1
            if (isAllSame(sublistArr) || isAllSame(mainlistArr)) {
                System.out.println("-1");
                return;
            }

            List<Integer> sublist = new ArrayList<>();
            for (String s : sublistArr) {
                try {
                    sublist.add(Integer.parseInt(s));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                    return;
                }
            }

            List<Integer> mainlist = new ArrayList<>();
            for (String s : mainlistArr) {
                try {
                    mainlist.add(Integer.parseInt(s));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                    return;
                }
            }

            if (sublist.size() > mainlist.size()) {
                System.out.println("Sublist not found");
                return;
            }

            boolean found = false;
            for (int i = 0; i <= mainlist.size() - sublist.size(); i++) {
                boolean match = true;
                for (int j = 0; j < sublist.size(); j++) {
                    if (!mainlist.get(i + j).equals(sublist.get(j))) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "Sublist found" : "Sublist not found");

        } finally {
            sc.close();
        }
    }

    private static boolean isAllSame(String[] arr) {
        if (arr.length <= 1)
            return true;
        String first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(first))
                return false;
        }
        return true;
    }
}