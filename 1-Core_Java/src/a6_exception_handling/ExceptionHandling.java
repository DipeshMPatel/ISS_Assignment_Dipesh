package a6_exception_handling;

public class ExceptionHandling {
	public static void main(String[] args) {
        try {
        	int a = 8;
        	int b = 0;
            int result = a / b;  // Will cause ArithmeticException
            System.out.println("Output : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        } finally {
            System.out.println("This will execute always");
        }
    }

}
 