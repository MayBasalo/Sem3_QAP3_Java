// EquilateralTriangle.java
// A special case of a Triangle where all sides are equal
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(sideA, 2);  // Area formula for an equilateral triangle
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
