class Rectangle {
    int length;
    int breadth;

    // Constructor with no parameters
    public Rectangle() {
        length = 10; // default values
        breadth = 5;
    }

    public int calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Area of the rectangle: " + rect.calculateArea());
    }
}
