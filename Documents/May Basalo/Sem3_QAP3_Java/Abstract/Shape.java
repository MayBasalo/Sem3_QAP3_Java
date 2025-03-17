public abstract class Shape {
    protected String name; // Name of the shape

    // Constructor to initialize the shape name

    public Shape(String name) {
        this.name = name;
    }

    // Getter method to get the shape name
    public String getName() {
        return name;
    }

    // Abstract methods to compute the perimeter and area of the shape
    public abstract double computePerimeter();
    public abstract double computeArea();

    // Overriding the toString method for printing the shape details
    @Override
    public String toString() {
        return name + " - Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}