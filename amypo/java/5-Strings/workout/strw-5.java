
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        String result = replaceAllOccurrences(str, oldWord, newWord);
        System.out.println(result);
    }

    public static String replaceAllOccurrences(String text, String oldWord, String newWord) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i <= text.length() - oldWord.length()) {
            if (text.substring(i, i + oldWord.length()).equals(oldWord)) {
                result.append(newWord);
                i += oldWord.length();
            } else {
                result.append(text.charAt(i));
                i++;
            }
        }
        while (i < text.length()) {
            result.append(text.charAt(i));
            i++;
        }

        return result.toString();
    }
}