package a1_basics_of_java;

public class Student {

    // Final Variable
    public final String studentName;

    // Static Variable
    static int studentsCreated = 0;

    // Instance Variables
    private int marks;
    private boolean isRegular;
    private double attendancePercentage;
    private char grade;

    // Protected Variable
    protected int studentsPassed = 0;

    // Default Constructor
    public Student() {

        this.studentName = "";
        this.marks = 0;
        this.isRegular = false;
        this.attendancePercentage = 0.0;
        this.grade = '-';
        
        Student.studentsCreated++;
        
    }

    // Parameterized Constructor
    public Student(String studentName, int marks, boolean isRegular, double attendancePercentage,char grade) {

        this.studentName = studentName;
        this.marks = marks;
        this.isRegular = isRegular;
        this.attendancePercentage = attendancePercentage;
        this.grade = grade;
        
        Student.studentsCreated++;
        
    }

    // Constructor Overloading
    public Student(String studentName, int marks, boolean isRegular) {

        this.studentName = studentName;
        this.marks = marks;
        this.isRegular = isRegular;
        
        Student.studentsCreated++;
        
    }

    // Getters and Setters

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean isRegular) {
        this.isRegular = isRegular;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    // Method (Behavior)

    public void displayDetails() {

        System.out.println("Student Name          : " + this.studentName);
        System.out.println("Marks                 : " + this.marks);
        System.out.println("Regular Student       : " + this.isRegular);
        System.out.println("Attendance Percentage : " + this.attendancePercentage);
        System.out.println("Grade                 : " + this.grade);

    }

}
