class Employee {
    private int id;
    private String name;
    private int type; // 1 = employee, 2 = manager
    private double baseSalary;

    // Constructor
    public Employee(int _id, String _name) {
        this.id = _id;
        this.name = _name;
    }

    // Mutators (Setters)
    public void setID(int x) {
        this.id = x;
    }

    public void setName(String x) {
        this.name = x;
    }

    public void setBaseSalary(double bs) {
        this.baseSalary = bs;
    }

    // Accessors (Getters)
    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        if (type == 2) {
            return baseSalary + baseSalary * 0.10; // 10% increase for manager
        }
        return baseSalary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Alice");
        emp.setBaseSalary(50000);
        emp.type = 2; // Manager
        System.out.println("Employee ID: " + emp.getID());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}