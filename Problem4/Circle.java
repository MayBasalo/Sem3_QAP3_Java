// Circle.java
// A special case of an Ellipse where major and minor axes are equal
public class Circle extends Ellipse {
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(majorAxis, 2);  // Area of a circle: πr²
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * majorAxis;  // Circumference: 2πr
    }
}
