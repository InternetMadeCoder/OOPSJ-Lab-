import java.io.File;

public class Prob1 {
    public static void listFiles(String directoryName) {
        File directory = new File(directoryName);

        // Get all files and directories
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    listFiles(file.getAbsolutePath()); // Recursive call
                }
            }
        }
    }

    public static void main(String[] args) {
        String directoryPath = "C:\\YourDirectoryPath"; // Replace with your directory path
        listFiles(directoryPath);
    }
}