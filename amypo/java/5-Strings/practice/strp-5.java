import java.util.Scanner;

public class PrefixBookCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String prefix = sc.nextLine();
        if (!input.matches("[a-zA-Z ]+") || !prefix.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input");
            return;
        }
        String[] titles = input.split(" ");
        int count = 0;
        for (String word : titles) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }

        System.out.println(count);
    }
}