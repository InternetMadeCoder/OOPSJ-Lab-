import java.io.File;

public class Prob4 {
    public static void main(String[] args) {
        File file = new File("fileToDelete.txt"); // Replace with the file path to delete

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file or file does not exist.");
        }
    }
}
