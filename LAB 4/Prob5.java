class Triangle {
    int a, b, c;

    public Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    public void calculatePerimeter() {
        int perimeter = a + b + c;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    public void calculateArea() {
        double s = (a + b + c) / 2.0; 
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        System.out.println("Area of the triangle: " + area);
    }
}

public class Prob5 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.calculatePerimeter();
        triangle.calculateArea();
    }
}
