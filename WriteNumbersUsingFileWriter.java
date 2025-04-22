import java.io.FileWriter;
import java.io.IOException;

public class WriteNumbersUsingFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("numbers.txt");

            for (int i = 1; i <= 10; i++) {
                writer.write(i + " ");
            }

            writer.close();
            System.out.println("Numbers written to file using FileWriter.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
