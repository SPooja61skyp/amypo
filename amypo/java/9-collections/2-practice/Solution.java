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
                sc.close();
                return;
            }
            
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                numbers.add(sc.nextInt());
            }
            
            int divisor = sc.nextInt();
            
            if (divisor <= 0) {
                System.out.println("Invalid input");
                sc.close();
                return;
            }

            List<Integer> filteredNumbers = new ArrayList<>();
            for (int num : numbers) {
                if (num % divisor != 0) {
                    filteredNumbers.add(num);
                }
            }
            
            Collections.reverse(filteredNumbers);
            
            for (int i = 0; i < filteredNumbers.size(); i++) {
                System.out.print(filteredNumbers.get(i));
                if (i < filteredNumbers.size() - 1) {
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