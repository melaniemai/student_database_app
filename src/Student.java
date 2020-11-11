import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuition;
    private int courseCost = 500; // default price

    // Constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Student last name: ");
        this.lastName = in.nextLine();

        System.out.println("-- STUDENT STATUS --");
        System.out.println("1. Freshman");
        System.out.println("2. Sophomore");
        System.out.println("3. Junior");
        System.out.println("4. Senior");
        System.out.print("Enter student status (1-4): ");
        this.gradeYear = in.nextInt();

        System.out.print("Welcome " + firstName + " " + lastName + ": " + gradeYear);
    }

    // Create student ID: 5-digit unique ID

    // Enroll in courses

    // View student's balance

    // Pay student tuition

    // Display student stats/info: name, ID, enrolled courses, and balance
}
