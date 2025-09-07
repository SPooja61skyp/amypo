import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                System.out.println("Invalid input");
                return;
            }
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        List<Character> duplicates = new ArrayList<>();
        for (char ch : freq.keySet()) {
            if (freq.get(ch) > 1)
                duplicates.add(ch);
        }
        Collections.sort(duplicates);

        if (duplicates.size() == 0) {
            System.out.println("0");
        } else {
            for (char ch : duplicates) {
                System.out.println(ch + "  " + freq.get(ch));
            }
        }
    }
}