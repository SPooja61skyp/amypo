import java.util.*;
class Employee {
    String name;
    int id;
    double baseSalary;
    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    public double calculateTotalSalary() {
        return baseSalary + baseSalary * 0.1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int id = sc.nextInt();
        if (id < 0) {
            System.out.println("Invalid input");
            return;
        }
        if (!sc.hasNextDouble() && !sc.hasNextFloat()) {
            System.out.println("Invalid input");
            return;
        }
        double baseSalary = sc.nextDouble();
        Employee emp = new Employee(name, id, baseSalary);
        System.out.println(emp.calculateTotalSalary());
        sc.close();
    }
}
