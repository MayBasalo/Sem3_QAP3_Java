// Shape.java
// Abstract class representing a generic shape
public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public abstract void scale(double factor);

    @Override
    public String toString() {
        return name + " - Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
