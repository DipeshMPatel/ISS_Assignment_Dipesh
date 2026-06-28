package a3_loop_control_and_decision_making;

public class Main {

    public static void main(String[] args) {

        LoopControlAndDecisionMaking lc = new LoopControlAndDecisionMaking();

        int number = 12345;
        System.out.println("Reverse of " + number + " : " + lc.reverseNumber(number));

        int[] marks = {85, 92, 76, 68, 90};
        System.out.println("Total Marks : " + lc.findTotalMarks(marks));

        int studentMarks = 38;
        System.out.println("Student Passed : " + lc.isPassed(studentMarks));

        double attendance = 82.5;
        System.out.println("Attendance Eligible : " + lc.hasRequiredAttendance(attendance));

        int[] attendanceRecord = {1, 1, 0, 1, 0, 1, 1};
        System.out.println("Absent Days : " + lc.countAbsentDays(attendanceRecord));

        int percentage = 74;
        System.out.println("Grade : " + lc.calculateGrade(percentage));

        int semester = 5;
        System.out.println("Semester : " + lc.getSemesterName(semester));

    }

}
