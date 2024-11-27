import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        File file = new File("numbers.txt"); // Replace with your file path

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0) {
                    throw new Exception("Positive number found: " + number);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
