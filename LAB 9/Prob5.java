// Define the Person interface
interface Person {
    String getName();
    void setName(String name);
}

// Class Student implementing Person
class Student implements Person {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void displayRole() {
        System.out.println("I am a Student. My name is " + name);
    }
}

// Class Employee implementing Person
class Employee implements Person {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void displayRole() {
        System.out.println("I am an Employee. My name is " + name);
    }
}

// Main method for testing
public class Prob5 {
    public static void main(String[] args) {
        Person student = new Student();
        student.setName("Alice");
        ((Student) student).displayRole(); // Output: I am a Student. My name is Alice

        Person employee = new Employee();
        employee.setName("Bob");
        ((Employee) employee).displayRole(); // Output: I am an Employee. My name is Bob
    }
}