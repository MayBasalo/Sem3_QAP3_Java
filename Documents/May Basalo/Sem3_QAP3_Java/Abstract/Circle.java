// Circle class that extends Shape 
public class Circle extends Shape {
    private double radius;
   
    // Contructor to initialize the radius of the circle
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    // Compute perimeter of a circle
@Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }
    // Compute area of a circle
@Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
     
}
