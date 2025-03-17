// Triangle class that extending Shape class
public class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor with validity check for Triangle
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");

       // Check if the given sides form a valid triangle
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Invalid Triangle sides! Exiting program.");
            System.exit(1); // Terminate the program if the side are invalid
        }
    }

     // Compute perimeter (sum of all sides)
    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }

    // Compute area of a triangle using Heron's formula
    @Override
    public double computeArea() {
        double s = computePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
