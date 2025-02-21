public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("Finally block executed");
            //  The problem is here.  If an exception is thrown and caught, the finally block will always execute and there is no guarantee that the value of x will not be modified in the finally block. 
            x = 20; // Modify the value of x in finally block which leads to unexpected behavior
        }
        System.out.println(x); // Output: 20. It should print the value as 5.
    }
}