import java.util.Scanner;

abstract class Bird {
    public abstract void fly();

    public abstract void sound();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("The eagle soars high in the sky");
    }

    @Override
    public void sound() {
        System.out.println("The eagle screeches");
    }
}

class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("The hawk glides smoothly through the air");
    }

    @Override
    public void sound() {
        System.out.println("The hawk shrieks");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String birdType = sc.nextLine();

        if (birdType.equalsIgnoreCase("Eagle")) {
            Bird eagle = new Eagle();
            eagle.fly();
            eagle.sound();
        } else if (birdType.equalsIgnoreCase("Hawk")) {
            Bird hawk = new Hawk();
            hawk.fly();
            hawk.sound();
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}