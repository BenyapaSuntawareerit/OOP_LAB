package lab4;

import java.util.Scanner;

public class PSUStudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();

            UndergradStudent p1 =
                new UndergradStudent(age, gpa);

            GradStudent p2 =
                new GradStudent(age, gpa);

            System.out.println("Undergraduate student created.");
            System.out.println("Graduate student created.");

            System.out.println(p1.getAge());
            System.out.println(p1.revealGrade());

            System.out.println(p2.getAge());
            System.out.println(p2.revealGrade());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

