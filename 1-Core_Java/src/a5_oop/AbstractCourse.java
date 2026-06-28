package a5_oop;

/**
 * Demonstrates:
 * Abstract Class
 * Abstract Methods
 */

public abstract class AbstractCourse {
	
	// If a class contains even one abstract method, it must be declared as an abstract class.
	// An abstract class can also have normal (non-abstract) methods with method bodies.

    protected String courseName;
    protected int credits;
    
    
    // Although an Abstract Class cannot be instantiated,
    // its constructor is called when a Child Class object is created.

    // Parameterized Constructor
    public AbstractCourse(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    // Abstract Methods
    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract void displayCourseDetails();
    
    
	// Concrete Method
	public void showCourseType() {
	    System.out.println("Abstract Course");
	}
}