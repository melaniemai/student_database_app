import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuition;
    private static int courseCost = 500; // default price
    private static int id = 10000;

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

        setStudentID();
        System.out.println("Welcome " + firstName + " " + lastName + ": " + gradeYear);
        System.out.println("Student ID: " + studentID);

    }

    // Create student ID: 5-digit unique ID
    // * Student ID: Grade level + ID
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // * User will continue to enroll in courses through a loop
        // * Once the user enters the number '0', the loop will terminate
        // * indicating the user is done enrolling in their courses
        System.out.print("Enter course to enroll (0 to quit): ");
    }

    // View student's balance

    // Pay student tuition

    // Display student stats/info: name, ID, enrolled courses, and balance
}