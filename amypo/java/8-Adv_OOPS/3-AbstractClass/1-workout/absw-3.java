import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int side = sc.nextInt();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side <= 0) {
            System.out.println("Invalid input");
            return;
        }

        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("Invalid input");
            return;
        }
        int trianglePerimeter = side1 + side2 + side3;
        double s = trianglePerimeter / 2.0;
        double triangleArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        int squarePerimeter = 4 * side;
        int squareArea = side * side;

        System.out.printf("%.2f\n", triangleArea);
        System.out.printf("%.2f\n", (double) trianglePerimeter);
        System.out.printf("%.2f\n", (double) squareArea);
        System.out.printf("%.2f\n", (double) squarePerimeter);
    }
}