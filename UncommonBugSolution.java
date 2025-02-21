public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("Finally block executed");
            // Avoid modifying x in finally block to prevent unexpected behavior
        }
        System.out.println(x); // Output: Exception, x value remains 5
    }
} 
//To handle the exception in a more controlled way you could introduce a variable to track changes after the exception
//Consider using try-with-resource to ensure automatic resource cleanup.
