package a6_exception_handling;

/**
 * Concept:
 * Exception Hierarchy
 * More specific exceptions should be caught before general exceptions.
 */

public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("Dipesh");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
        
        // The most general Exception must be caught last,
        // otherwise it results in a compile-time error:
        // "Exception has already been caught".
        // Therefore, catch more specific exceptions before general exceptions.

    }

}