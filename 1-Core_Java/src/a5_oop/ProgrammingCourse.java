package a5_oop;

/**
 * Demonstrates:
 * Extending an Abstract Class
 * Implementing Abstract Methods
 */

public class ProgrammingCourse extends AbstractCourse {

    private int durationInWeeks;
    private String instructorName;

    // Constructor
    public ProgrammingCourse(String courseName, int credits, int durationInWeeks, String instructorName) {

        // Calls the Constructor of the Abstract Class
        super(courseName, credits);

        this.durationInWeeks = durationInWeeks;
        this.instructorName = instructorName;

    }

    // Implementing Abstract Methods

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void displayCourseDetails() {

        // (protected courseName and credits) are accessible directly because ProgrammingCourse is a subclass of AbstractCourse.
        System.out.println("Course Name      : " + courseName);
        System.out.println("Credits          : " + credits);

        System.out.println("Duration         : " + durationInWeeks + " Weeks");
        System.out.println("Instructor Name  : " + instructorName);

    }

}