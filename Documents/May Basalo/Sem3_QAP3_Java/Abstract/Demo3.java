public class Demo3 {
    public static void main(String[] args) {
        // Create objects of various shapes
        Shape[] shapes = new Shape[4];
        shapes[0] = new Ellipse(10, 5);             // Ellipse with major=10, minor=5
        shapes[1] = new Circle(7);                  // Circle with radius 7
        shapes[2] = new Triangle(3, 4, 5);          // Triangle with sides 3, 4, 5
        shapes[3] = new EquilateralTriangle(6);     // Equilateral Triangle with side 6

        // Loop through shapes array and print details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}