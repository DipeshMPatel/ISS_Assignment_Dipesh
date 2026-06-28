package a7_collection;

/**
 * Demonstrates:
 * Comparable Interface
 */

public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Comparable is used for Natural Sorting.
    // Here Students are sorted according to their ID.
 
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return "Student [ID = " + id + ", Name = " + name + "]";
    }

}