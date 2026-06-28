package a5_oop;

/**
 * Demonstrates:
 * Inheritance
 * Method Overriding
 * Method Overloading
 * Runtime Polymorphism
 */

public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("Parent Object:");

        // Parent Class Object
        Person person = new Person("Rahul", 45);

        person.displayDetails();
        person.showInformation();
        person.showInformation("Parent Class Object");

        System.out.println();

        System.out.println("Child Object:");

        // Child Class Object
        Student student = new Student("Dipesh", 21, 101, 88);

        student.displayDetails();

        System.out.println();

        student.attendLecture();
        student.submitAssignment();

        System.out.println();

        student.showResult();
        student.showResult(88);
        student.showResult(88, "Java");

        System.out.println();

        student.setMarks(92);
        System.out.println("Updated Marks : " + student.getMarks());

        System.out.println();

        System.out.println("Runtime Polymorphism:");

        // Parent Class Reference Variable used to Access Child Class Object (Upcasting)
        Person ref = new Student("Sam", 20, 38, 81);	   // Accessible methods depend on the reference type, but the method executed depends on the object type.

        // Calls Student's overridden version (Runtime Polymorphism)
        ref.displayDetails();
        
        

    }

}