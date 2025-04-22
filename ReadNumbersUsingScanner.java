import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbersUsingScanner {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Numbers from file:");
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.println(num);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

