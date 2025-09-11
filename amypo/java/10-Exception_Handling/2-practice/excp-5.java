import java.util.*;

class Calculator {
    private int[] products;
    private int divisor;

    public Calculator(int[] products, int divisor) {
        this.products = products;
        this.divisor = divisor;
    }

    public void divideProducts() {
        try {
            for (int p : products) {
                System.out.print((p / divisor) + " ");
            }
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }

    public void getProductAtIndex(int index) {
        try {
            System.out.println(products[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }

    public void printAverage() {
        try {
            double sum = 0;
            for (int p : products) {
                sum += p;
            }
            System.out.println(sum / products.length);
        } catch (Exception e) {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine().trim());
            int[] arr = new int[n];

            String[] input = sc.nextLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            int divisor = Integer.parseInt(sc.nextLine().trim());
            int index = Integer.parseInt(sc.nextLine().trim());

            Calculator calc = new Calculator(arr, divisor);
            calc.divideProducts();
            calc.getProductAtIndex(index);
            calc.printAverage();

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}