package a4_strings_arrays;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        // Declaration and Instantiation
        int[] marks = new int[5];

        marks[0] = 82;
        marks[1] = 76;
        marks[2] = 91;
        marks[3] = 68;
        marks[4] = 85;

        // Declaration + Initialization
        int[] attendance = {90, 85, 88, 92};

        System.out.println("Length of marks array : " + marks.length);

        System.out.println();
        System.out.println("Using For Loop:");

        for (int i = 0; i < attendance.length; i++) {
            System.out.println(attendance[i]);
        }

        System.out.println();
        System.out.println("Using For-Each Loop:");

        for (int value : attendance) {
            System.out.println(value);
        }

        // Passing array to method
        System.out.println();
        System.out.println("Average Attendance : " + getAverage(attendance));

        // Returning array from method
        int[] increasedMarks = addGraceMarks(marks);

        System.out.println("Marks before Grace : " + Arrays.toString(marks));
        System.out.println("Marks after Grace : " + Arrays.toString(increasedMarks));

        // Anonymous Array
        System.out.println("Average of Anonymous Array : " + getAverage(new int[] {80, 82, 84, 86}));

        // Two-Dimensional Array
        int[][] studentMarks = {
                {85, 90},
                {76, 88},
                {91, 95}
        };

        System.out.println();
        System.out.println("2D Array:");

        for (int row = 0; row < studentMarks.length; row++) {
            for (int col = 0; col < studentMarks[row].length; col++) {
                System.out.print(studentMarks[row][col] + " ");
            }

            System.out.println();
        }

        // Jagged Array
        int[][] jaggedArray = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}
        };

        System.out.println();
        System.out.println("Jagged Array:");

        for (int[] row : jaggedArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
            
        }

        // Copying Array
        int[] copiedArray = new int[marks.length];

        System.arraycopy(marks, 0, copiedArray, 0, marks.length);

        System.out.println();
        System.out.println("Copied Array : " + Arrays.toString(copiedArray));

        // Cloning Array
        int[] clonedArray = marks.clone();

        System.out.println("Cloned Array : " + Arrays.toString(clonedArray));

    }

    public static double getAverage(int[] arr) {

        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        return (double) sum / arr.length;

    }

    public static int[] addGraceMarks(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] + 5;
        }

        return result;

    }

}