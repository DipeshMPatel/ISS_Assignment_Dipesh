package a7_collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // List of Integers
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1);

        Collections.sort(numbers);

        System.out.println("Sorted Integers : " + numbers);

        System.out.println();

        // List of Student Objects
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(102, "Dipesh"));
        studentList.add(new Student(101, "Sam"));
        studentList.add(new Student(103, "Nick"));

        // Comparable - Sort by Student ID  (Naturally)
        Collections.sort(studentList);
        
        System.out.println("Students Sorted by ID:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        
        System.out.println();

        
//        Collections.sort(list, comparator)
//					//     ↑        ↑
//					//  what to   how to
//					//   sort      sort
//        
        
        // Comparator - Sort by Student Name
        Collections.sort(studentList, Comparator.comparing(Student::getName));
//        student -> student.getName()  // lambda version
//        Student::getName              // method reference version (cleaner)

        System.out.println("Students Sorted by Name:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        
        System.out.println();

        
        // HashSet stores only unique elements
        Set<Student> studentSet = new HashSet<>(studentList);

        System.out.println("Student Set:");

        for (Student student : studentSet) {
            System.out.println(student);
        }

        System.out.println();

        // Map<Student ID, Student Object>
        Map<Integer, Student> studentMap = new HashMap<>();

        for (Student student : studentList) {
            studentMap.put(student.getId(), student);
        }

        System.out.println("Student Map:");

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}