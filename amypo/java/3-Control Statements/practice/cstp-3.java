import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float data = sc.nextFloat();
        if (data <= 0) {
            System.out.println("Invalid Input");

        } else {

            float a = data - 2;
            float b = a * 20;
            int s = (int) b;
            System.out.println(s);
        }
    }
}