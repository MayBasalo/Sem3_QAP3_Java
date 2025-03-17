// Triangle.java
// Represents a general triangle
public class Triangle extends Shape {
    protected double sideA, sideB, sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's Formula
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void scale(double factor) {
        this.sideA *= factor;
        this.sideB *= factor;
        this.sideC *= factor;
    }
}
