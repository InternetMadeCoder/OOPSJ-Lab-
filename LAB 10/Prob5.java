import java.io.File;
import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists.");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Type: " + (file.isDirectory() ? "Directory" : "File"));
            System.out.println("Length: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}