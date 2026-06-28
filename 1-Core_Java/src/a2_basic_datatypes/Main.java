package a2_basic_datatypes;

/**
 * Demonstrates usage of various primitive data types using the Student class.
 *
 * Concepts:
 * Class, Object Creation, Primitive Data Types,
 * Constructor and Method Invocation
 */

public class Main {

    public static void main(String[] args) {

        // Creating Student object using Constructor
        Student student1 = new Student(
                (byte) 42,
                (short) 2022,
                88,
                9876543210L,
                true,
                9.5f,
                92.75,
                'A');

        student1.displayDetails();

        System.out.println();
        System.out.println("Modifying Object using setters...");

        // Updating values using setters
        student1.setAttendancePercentage(95.50);
        student1.setGrade('O');

        System.out.println();
        System.out.println("After changing some values:");

        student1.displayDetails();
    }

}