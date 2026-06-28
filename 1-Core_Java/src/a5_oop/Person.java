package a5_oop;

/**
 * Parent Class
 * Demonstrates:
 * Class, Encapsulation, Constructor,
 * Method, Inheritance
 */

public class Person {

    private String name;
    private int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display details

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Age  : " + this.age);
    }

    // Method Overloading

    public void showInformation() {
        System.out.println("Person Information");
    }

    public void showInformation(String message) {
        System.out.println(message);
    }

}