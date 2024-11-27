import java.io.FileReader;
import java.io.IOException;

public class Prob2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("sample.txt")) { // Replace "sample.txt" with your file path
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
