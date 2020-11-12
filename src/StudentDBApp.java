import java.util.Scanner;

public class StudentDBApp {
    public static void main(String[] args) throws Exception {
        // Query number of students to add
        System.out.print("Number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create x amount of students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].showInfo());
        }
    }
}
