import java.lang.*;

public class ExceptionExample {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Divided by zero error: " + ae);
        }
        System.out.println("Result: " + result);
    }
}
 
