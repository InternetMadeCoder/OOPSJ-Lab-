// Define the Taxable interface
interface Taxable {
    double calculateTax();
}

// Abstract class Employee
abstract class Employee implements Taxable {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Abstract method to display employee details
    public abstract void displayDetails();
}

// Subclass Manager
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateTax() {
        return (salary + bonus) * 0.2; // Tax is 20% of total income
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Tax: " + calculateTax());
    }
}

// Subclass Developer
class Developer extends Employee {
    private double stockOptions;

    public Developer(String name, double salary, double stockOptions) {
        super(name, salary);
        this.stockOptions = stockOptions;
    }

    @Override
    public double calculateTax() {
        return salary * 0.15; // Tax is 15% of salary (stock options not taxed)
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Stock Options: " + stockOptions);
        System.out.println("Tax: " + calculateTax());
    }
}

// Main class
public class Prob3 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 120000, 20000);
        Employee developer = new Developer("Bob", 90000, 5000);

        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();

        System.out.println("Developer Details:");
        developer.displayDetails();
    }
}