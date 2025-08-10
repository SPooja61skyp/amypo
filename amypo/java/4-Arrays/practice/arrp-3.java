import java.util.*;

public class FinalTwoSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<String> seenPairs = new HashSet<>();
        List<String> resultPairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                int num1 = complement;
                int num2 = arr[i];
                String pair = num1 + "," + num2;
                if (!seenPairs.contains(pair)) {
                    resultPairs.add(pair);
                    seenPairs.add(pair);
                }
            }

            map.put(arr[i], i);
        }

        if (resultPairs.isEmpty()) {
            System.out.println("No valid pairs found");
        } else {
            for (String pair : resultPairs) {
                System.out.println(pair);
            }
        }

        sc.close();
    }
}