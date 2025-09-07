import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String move1 = sc.nextLine().trim().toLowerCase();
        String move2 = sc.nextLine().trim().toLowerCase();
        Set<String> validMoves = new HashSet<>(Arrays.asList("rock", "paper", "scissors"));
        if (!validMoves.contains(move1) || !validMoves.contains(move2)) {
            System.out.println("Invalid move");
        } else if (move1.equals(move2)) {
            System.out.println("TIE");
        } else if (
            (move1.equals("rock") && move2.equals("scissors")) ||
            (move1.equals("scissors") && move2.equals("paper")) ||
            (move1.equals("paper") && move2.equals("rock"))
        ) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
        sc.close();
    }
}
