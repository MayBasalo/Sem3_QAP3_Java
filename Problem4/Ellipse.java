// Ellipse.java
// Represents an ellipse, implementing Scalable
public class Ellipse extends Shape {
    protected double majorAxis;
    protected double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double getPerimeter() {
        // Approximation formula for ellipse perimeter
        return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }

    @Override
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }
}
