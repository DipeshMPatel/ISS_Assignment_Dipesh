package a5_oop;

/**
 * Demonstrates:
 * Compile-Time Polymorphism (Method Overloading)
 * Runtime Polymorphism (Method Overriding)
 */

public class PolymorphismDemo {

    public static void main(String[] args) {

        System.out.println("Runtime Polymorphism:");

        // Parent Class Reference Variable used to Access Parent Class Object
        System.out.println("Parent Class Reference to Parent class object ");
        Person personRef = new Person("Rahul", 45);
        personRef.displayDetails();

        System.out.println();

        // Parent Class Reference Variable used to Access Child Class Object (Upcasting)
        System.out.println("Parent Class Reference to Child class object");
        personRef = new Student("Dipesh", 21, 101, 88);
        personRef.displayDetails();				// Accessible methods depend on the reference type, but the method executed depends on the object type.

        System.out.println();

        System.out.println("Compile-Time Polymorphism:");

        // Child Class Object
        Student student = new Student("Dipesh", 21, 42, 91);

        // Method Overloading
        student.showResult();
        student.showResult(91);
        student.showResult(91, "Java");

    }

}