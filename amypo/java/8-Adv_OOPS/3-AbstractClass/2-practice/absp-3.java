import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();

        if (nStr == null || nStr.isEmpty() || nStr.length() > 18) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        try {
            BigInteger n = new BigInteger(nStr);
            if (n.compareTo(BigInteger.ZERO) <= 0) {
                System.out.println("Invalid input");
                sc.close();
                return;
            }

            BigInteger smallerPalindrome = findSmallerPalindrome(n);
            BigInteger largerPalindrome = findLargerPalindrome(n);

            if (smallerPalindrome.equals(n) && largerPalindrome.equals(n)) {
                System.out.println("Invalid input");
                sc.close();
                return;
            }

            BigInteger diffSmaller = n.subtract(smallerPalindrome).abs();
            BigInteger diffLarger = largerPalindrome.subtract(n).abs();

            if (diffSmaller.compareTo(diffLarger) <= 0) {
                System.out.println(smallerPalindrome);
            } else {
                System.out.println(largerPalindrome);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }

    private static BigInteger findSmallerPalindrome(BigInteger n) {
        BigInteger current = n.subtract(BigInteger.ONE);
        while (true) {
            if (isPalindrome(current)) {
                return current;
            }
            current = current.subtract(BigInteger.ONE);
        }
    }

    private static BigInteger findLargerPalindrome(BigInteger n) {
        BigInteger current = n.add(BigInteger.ONE);
        while (true) {
            if (isPalindrome(current)) {
                return current;
            }
            current = current.add(BigInteger.ONE);
        }
    }

    private static boolean isPalindrome(BigInteger num) {
        String original = num.toString();
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
