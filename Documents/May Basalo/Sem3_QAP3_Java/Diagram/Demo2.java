// Demo2.java
public class Demo2 {
    public static void main(String[] args) {
        // Testing Point
        Point point = new Point(1.5f, 2.5f);
        System.out.println("Point: " + point);
        point.setXY(4.0f, 6.0f);
        System.out.println("Updated Point: " + point);

        // Testing MovablePoint
        MovablePoint movablePoint = new MovablePoint(3.0f, 4.0f, 0.5f, 0.75f);
        System.out.println("MovablePoint (Before Move): " + movablePoint);
        movablePoint.move();
        System.out.println("MovablePoint (After Move): " + movablePoint);

        // Change speed and move again
        movablePoint.setSpeed(1.0f, 1.5f);
        movablePoint.move();
        System.out.println("MovablePoint (After Speed Change and Move): " + movablePoint);
    }
}
