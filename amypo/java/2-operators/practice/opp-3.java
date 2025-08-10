import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        float w = sc.nextFloat();
        float bmi = w / (h * h);
        System.out.printf("%.2f\n", bmi);
        if (bmi <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");

        } else {
            System.out.println("Obese");
        }

    }
}