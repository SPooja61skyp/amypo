import java.util.*;

class Calculator {
    private List<Integer> scores;
    private int divisor;
    private int index;

    public Calculator(List<Integer> scores, int divisor, int index) {
        this.scores = scores;
        this.divisor = divisor;
        this.index = index;
    }

    public void process() {
        try {
            // Check for zero divisor
            if (divisor == 0)
                throw new ArithmeticException();

            // Print divided scores
            for (int score : scores) {
                System.out.print(score / divisor + " ");
            }
            System.out.println();

            // Check for index bounds
            if (index < 0 || index >= scores.size())
                throw new IndexOutOfBoundsException();

            // Print score at index
            System.out.println("Score at index " + index + ": " + scores.get(index));

            // Calculate and print average
            double sum = 0;
            for (int score : scores)
                sum += score;
            double avg = sum / scores.size();
            System.out.printf("Average score: %.1f\n", avg);

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            String[] scoreTokens = sc.nextLine().split(" ");
            if (scoreTokens.length != n)
                throw new InputMismatchException();

            List<Integer> scores = new ArrayList<>();
            for (String token : scoreTokens) {
                scores.add(Integer.parseInt(token));
            }

            int divisor = Integer.parseInt(sc.nextLine());
            int index = Integer.parseInt(sc.nextLine());

            Calculator calc = new Calculator(scores, divisor, index);
            calc.process();

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}