package a3_loop_control_and_decision_making;

/**
 * Loops:
 * For Loop, While Loop, Do While Loop
 *
 * Decision Making:
 * If Statement, If Else Statement,
 * If Else-If Ladder, Switch Statement
 *
 * Ternary Operator
 */

public class LoopControlAndDecisionMaking {

    // While Loop
    public int reverseNumber(int number) {

        int reverse = 0;

        while (number > 0) {
        	int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return reverse;
    }

    // For Loop
    public int findTotalMarks(int[] marks) {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total;
    }

    // If-Else Statement
    public boolean isPassed(int marks) {

        if (marks >= 40) {
            return true;
        }

        return false;
    }

    // Ternary Operator
    public boolean hasRequiredAttendance(double attendance) {

        return attendance >= 75 ? true : false;
    }

    // Do-While Loop
    public int countAbsentDays(int[] attendanceRecord) {

        int i = 0;
        int absentDays = 0;

        do {

            if (attendanceRecord[i] == 0) {
                absentDays++;
            }

            i++;

        } while (i < attendanceRecord.length);

        return absentDays;
    }
    
	 // If Statement
	    public void checkPerfectScore(int marks) {
	
	        if (marks == 100) {
	            System.out.println("Perfect Score!");
	        }
	
	    }

    // If-Else-If Ladder
    public String calculateGrade(int percentage) {

        if (percentage >= 90) {
            return "O";
        } else if (percentage >= 75) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "Fail";
        }

    }

    // Switch Statement
    public String getSemesterName(int semester) {

        switch (semester) {

            case 1:
                return "Semester I";

            case 2:
                return "Semester II";

            case 3:
                return "Semester III";

            case 4:
                return "Semester IV";

            case 5:
                return "Semester V";

            case 6:
                return "Semester VI";

            default:
                return "Invalid Semester";

        }

    }

}