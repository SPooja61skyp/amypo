
import java.util.Scanner;

abstract class Student {
    public abstract char calculateGrade(double averageScore);
}

class Undergraduate extends Student {
    @Override
    public char calculateGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

class Postgraduate extends Student {
    @Override
    public char calculateGrade(double averageScore) {
        if (averageScore >= 85) {
            return 'A';
        } else if (averageScore >= 75) {
            return 'B';
        } else if (averageScore >= 65) {
            return 'C';
        } else if (averageScore >= 55) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentType = sc.nextLine();
        
        if (!studentType.equalsIgnoreCase("Undergraduate") && !studentType.equalsIgnoreCase("Postgraduate")) {
            System.out.println("Invalid student type");
            sc.close();
            return;
        }
        
        int numScores = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < numScores; i++) {
            sum += sc.nextDouble();
        }

        double averageScore = sum / numScores;
        Student student;

        if (studentType.equalsIgnoreCase("Undergraduate")) {
            student = new Undergraduate();
        } else {
            student = new Postgraduate();
        }

        System.out.println(student.calculateGrade(averageScore));
        sc.close();
    }
}