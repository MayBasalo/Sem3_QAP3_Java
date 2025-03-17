// Demo4.java
// Demonstrates scaling different shapes
public class Demo4 {
    public static void main(String[] args) {
        // Create objects of different shapes
        Scalable ellipse1 = new Ellipse("Ellipse1", 10.0, 5.0);
        Scalable ellipse2 = new Ellipse("Ellipse2", 20.0, 10.0);
        Scalable circle1 = new Circle("Circle1", 7.0);
        Scalable circle2 = new Circle("Circle2", 15.0);
        Scalable triangle1 = new Triangle("Triangle1", 3.0, 4.0, 5.0);
        Scalable triangle2 = new Triangle("Triangle2", 6.0, 8.0, 10.0);
        Scalable eqTriangle1 = new EquilateralTriangle("EquilateralTriangle1", 6.0);
        Scalable eqTriangle2 = new EquilateralTriangle("EquilateralTriangle2", 10.0);

        // Store them in a Scalable array
        Scalable[] shapes = { ellipse1, ellipse2, circle1, circle2, triangle1, triangle2, eqTriangle1, eqTriangle2 };

        // Print shapes before scaling
        System.out.println("Shapes before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 1.5
        scaleAllShapes(shapes, 1.5);

        // Print shapes after scaling
        System.out.println("\nShapes after scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale all shapes
    public static void scaleAllShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
