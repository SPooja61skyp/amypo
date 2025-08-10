import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (!word.matches("[a-zA-Z]+")) {
                System.out.println("Invalid Input");
                return;
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}