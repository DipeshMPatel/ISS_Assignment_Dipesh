package a6_exception_handling;

/*
 * Notes: 
 *
 * throw  -> Used to explicitly throw an exception.
 *
 * throws -> Used in the method signature to indicate that
 *           the method may throw Checked Exceptions.
 *
 * Unchecked Exceptions (RuntimeException and its subclasses)
 * do not require the use of 'throws'.
 *
 * Checked Exceptions (Exception subclasses excluding RuntimeException)
 * must either be handled using try-catch or declared using 'throws'.
 */

/**
 * Demonstrates:
 * throw
 * throws
 * Built-in Exception
 * Custom Exception
 */

// Custom Checked Exception
// Since it extends Exception (and not RuntimeException),
// it is a Checked Exception.
class InvalidAgeException extends Exception {
	
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ThrowVsThrows {

    // throw is used to explicitly throw an exception.
    // IllegalArgumentException is an Unchecked Exception,
    // so the method is NOT required to declare 'throws'.
    static void checkStudentName(String studentName) {
    	
        if (studentName == null || studentName.isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
        
        System.out.println("Student Name : " + studentName);
    }

    
    // throws is used because InvalidAgeException is a Checked Exception.
    // Since it extends Exception, the compiler forces us to either:
    // 1. Handle it using try-catch
    // OR
    // 2. Declare it using throws.
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Student must be at least 18 years old.");
        }

        System.out.println("Age : " + age);
    }

    
    
    public static void main(String[] args) {

        try {
            checkStudentName("");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Built-in Exception : " + e.getMessage());
        }

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception : " + e.getMessage());
        }

    }

}


