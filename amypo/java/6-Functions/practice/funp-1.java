import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int targetSum = sc.nextInt();

        if (isSubsetSum(arr, n, targetSum)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        if (sum == 0) return true;  
        if (n == 0) return false;


        if (arr[n - 1] > sum) {
            return isSubsetSum(arr, n - 1, sum);
        }


        return isSubsetSum(arr, n - 1, sum) || 
               isSubsetSum(arr, n - 1, sum - arr[n - 1]);
    }
}