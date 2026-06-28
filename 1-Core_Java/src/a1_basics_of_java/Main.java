package a1_basics_of_java;

/**
 * Concepts Discussed:
 * Class, Objects, State, Methods
 * Variable Types, Modifier Types, Final Keyword,
 * Constructors and Types of Constructors
 *
 * Variable Types:
 * Instance Variables, Static Variables,
 * Local Variables, Parameters
 *
 * Access Modifier Types:
 * Default, Public, Private, Protected
 *
 * Constructors:
 * Default Constructor,
 * Parameterized Constructor,
 * Constructor Overloading
 */

public class Main {

    public static void main(String[] args) {

        // Local Variable
        int totalMarks = 0;

        // Default Constructor
        Student student1 = new Student();
        System.out.println("Output from Default Constructor:");
        student1.displayDetails();
        System.out.println();

        // Parameterized Constructor
        Student student2 = new Student("Dipesh", 88, true, 91.5, 'A');
        System.out.println("Output from Parameterized Constructor:");
        student2.displayDetails();
        System.out.println();

        // Constructor Overloading
        Student student3 = new Student("Rahul", 76, false);
        System.out.println("Output from Overloaded Constructor:");
        student3.displayDetails();
        System.out.println();

        totalMarks = student1.getMarks() + student2.getMarks() + student3.getMarks();
        System.out.println();

        System.out.println("Total Marks of all Students : " + totalMarks);

        // Accessing Static Variable
        System.out.println("Total Students Created : " + Student.studentsCreated);

        // student1.studentName = "Sam";    // Error because studentName is final

        // Accessing Protected Variable
        System.out.println("Students Passed : " + student1.studentsPassed);
    }

}