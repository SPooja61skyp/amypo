import java.util.*;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine().trim();
        if (type.equals("Circle")) {
            double r = Double.parseDouble(sc.nextLine().trim());
            if (r < 0) {
                System.out.println("Invalid input");
                return;
            }
            Shape s = new Circle(r);
            System.out.printf("%.2f\n", s.area());
        } else if (type.equals("Rectangle")) {
            double w = Double.parseDouble(sc.nextLine().trim());
            double h = Double.parseDouble(sc.nextLine().trim());
            if (w < 0 || h < 0) {
                System.out.println("Invalid input");
                return;
            }
            Shape s = new Rectangle(w, h);
            System.out.printf("%.2f\n", s.area());
        } else {
            System.out.println("Invalid input");
        }
    }
}