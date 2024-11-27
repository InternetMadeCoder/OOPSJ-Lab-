import java.io.FileOutputStream;
import java.io.PrintStream;

class Student {
    int rollNo;
    String name;
    String department;

    public Student(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }
}

public class Prob3 {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice", "Computer Science");

        try (PrintStream out = new PrintStream(new FileOutputStream("student.txt"))) {
            out.println("Roll No: " + student.rollNo);
            out.println("Name: " + student.name);
            out.println("Department: " + student.department);
            System.out.println("Student details written to file.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
