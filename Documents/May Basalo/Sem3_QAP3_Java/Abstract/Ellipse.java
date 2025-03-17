// Ellipse class that extends Shape class
public class Ellipse extends Shape {
    private double a, b; // Major and minor axes

    // Constructor assign largest value to 'a' and smallest value to 'b'
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    // existing code

    // Compute perimeter of an ellipse (approximate formula)
    @Override
    public double computePerimeter() {
        return Math.PI * 2 * (a + b) - (Math.pow((a - b), 2) / 2);
    }

    // Compute area of an ellipse (πab)
    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }
}

