class Triangle {
    private double height;
    private double base;

    // Constructor
    public Triangle(double h, double b) {
        this.height = h;
        this.base = b;
    }

    // Mutators (Setters)
    public void setHeight(double x) {
        this.height = x;
    }

    public void setBase(double x) {
        this.base = x;
    }

    // Accessors (Getters)
    public double getHeight() {
        return this.height;
    }

    public double getBase() {
        return this.base;
    }

    // Method to calculate area
    public double getArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        System.out.println("Area of the triangle: " + triangle.getArea());
    }
}