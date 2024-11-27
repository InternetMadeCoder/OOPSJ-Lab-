class Rectangle {
    int length;
    int breadth;

    // Constructor without parameters
    public Rectangle() {
        length = 10; // default values
        breadth = 5;
    }

    // Constructor with parameters
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(15, 8);
        
        System.out.println("Perimeter of rectangle (default): " + rect1.calculatePerimeter());
        System.out.println("Perimeter of rectangle (with params): " + rect2.calculatePerimeter());
    }
}
