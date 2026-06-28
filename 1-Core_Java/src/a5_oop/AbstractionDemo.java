package a5_oop;

/**
 * Demonstrates:
 * Abstract Class
 * Abstract Methods
 * Constructor Chaining
 * Runtime Polymorphism
 */

public class AbstractionDemo {
    public static void main(String[] args) {

        // Cannot create an object of an Abstract Class
        // AbstractCourse course = new AbstractCourse();

        // Abstract Class Reference Variable used to Access Child Class Object
        AbstractCourse course = new ProgrammingCourse("Core Java", 4, 8, "Dipesh");

        course.displayCourseDetails();		// Calls ProgrammingCourse's implementation (Runtime Polymorphism)
        System.out.println();
        course.showCourseType();			// Calls the concrete method defined in the Abstract Class

        System.out.println();

        System.out.println("Course Name : " + course.getCourseName());
        course.setCourseName("Advanced Java");
        System.out.println("Updated Course Name : " + course.getCourseName());

    }

}