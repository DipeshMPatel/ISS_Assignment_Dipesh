package a5_oop;

/**
 * Child Class
 * Demonstrates:
 * Inheritance, Method Overriding,
 * Constructor Chaining,
 * Interface Implementation,
 * Method Overloading
 */

public class Student extends Person implements StudentActivity {

    private int rollNumber;
    private int marks;

    // Constructor
    public Student(String name, int age, int rollNumber, int marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getters and Setters

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    
    // Method Overriding

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number : " + this.rollNumber);
        System.out.println("Marks       : " + this.marks);

    }

    
    // Interface Method Implementation

    @Override
    public void attendLecture() {
        System.out.println("Student is attending the lecture.");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Student submitted the assignment.");
    }

    
    // Method Overloading

    public void showResult() {
        System.out.println("Result is not available.");
    }

    public void showResult(int marks) {
        System.out.println("Marks : " + marks);
    }

    public void showResult(int marks, String subject) {
        System.out.println(subject + " Marks : " + marks);
    }

}