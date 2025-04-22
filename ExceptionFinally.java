import java.lang.*;

public class ExceptionFinally{
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Divided by zero error: " + ae);
        } finally {
            System.out.println(100);
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            System.out.println("Result: " + result);
        }
    }
}

