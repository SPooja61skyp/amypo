import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float f = ((c * 9) / 5) + 32;
        System.out.printf("%.2f", f);
    }
}