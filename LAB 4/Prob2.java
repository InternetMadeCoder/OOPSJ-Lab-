class Student {
    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + roll_no);
    }
}

public class Prob2 {
    public static void main(String[] args) {
        Student student1 = new Student("Gayathri", 4);

        student1.displayInfo();
    }
}
