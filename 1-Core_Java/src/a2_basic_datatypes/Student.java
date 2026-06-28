package a2_basic_datatypes;

public class Student {

    private byte rollNumber;                  // Student Roll Number
    private short admissionYear;              // Admission Year
    private int marks;                        // Marks Obtained
    private long registrationNumber;          // University Registration Number
    private boolean isRegular;                // Regular Student or Not
    private float cgpa;                       // CGPA
    private double attendancePercentage;      // Attendance Percentage
    private char grade;                       // Final Grade

    // Constructor
    Student(byte rollNumber,
            short admissionYear,
            int marks,
            long registrationNumber,
            boolean isRegular,
            float cgpa,
            double attendancePercentage,
            char grade) {

        this.rollNumber = rollNumber;
        this.admissionYear = admissionYear;
        this.marks = marks;
        this.registrationNumber = registrationNumber;
        this.isRegular = isRegular;
        this.cgpa = cgpa;
        this.attendancePercentage = attendancePercentage;
        this.grade = grade;
    }

    // Getters and Setters

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public short getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(short admissionYear) {
        this.admissionYear = admissionYear;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean isRegular) {
        this.isRegular = isRegular;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
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

    // Display Method

    public void displayDetails() {

        System.out.println("Roll Number             : " + this.rollNumber);
        System.out.println("Admission Year          : " + this.admissionYear);
        System.out.println("Marks                   : " + this.marks);
        System.out.println("Registration Number     : " + this.registrationNumber);
        System.out.println("Regular Student         : " + this.isRegular);
        System.out.println("CGPA                    : " + this.cgpa);
        System.out.println("Attendance Percentage   : " + this.attendancePercentage);
        System.out.println("Grade                   : " + this.grade);

    }

}