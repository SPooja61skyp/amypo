
import java.util.*;
abstract class Vehicle {
    abstract void describe();
}
class Car extends Vehicle {
    void describe() { System.out.println("This is a car"); }
}
class Bike extends Vehicle {
    void describe() { System.out.println("This is a bike"); }
}
class Truck extends Vehicle {
    void describe() { System.out.println("This is a truck"); }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int choice = sc.nextInt();
        Vehicle v;
        if (choice == 1) v = new Car();
        else if (choice == 2) v = new Bike();
        else if (choice == 3) v = new Truck();
        else {
            System.out.println("Invalid input");
            return;
        }
        v.describe();
        sc.close();
    }
}