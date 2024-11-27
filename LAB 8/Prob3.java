class Employee {
    public void work() {
        System.out.println("Working...");
    }

    public double getSalary() {
        return 30000; 
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("Managing employees...");
    }

    public void addEmployee() {
        System.out.println("Adding a new employee");
    }
}

public class Prob3 {
    public static void main(String[] args) {
        HRManager manager = new HRManager();
        manager.work();         
        manager.addEmployee();  
        System.out.println("Salary: " + manager.getSalary());
    }
}
