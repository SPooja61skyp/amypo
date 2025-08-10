import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 5 && age <= 18) {
            System.out.println("Eligible for admission");
        } else if (age < 5) {
            System.out.println("Too young for admission");
        } else {
            System.out.println("Too old for admission");
        }
    }
}