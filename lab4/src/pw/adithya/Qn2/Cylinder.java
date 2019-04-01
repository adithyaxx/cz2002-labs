package pw.adithya.Qn2;

public class Cylinder implements Shape{
    private int radius, length;

    public Cylinder(int radius, int length) {
        this.radius = radius;
        this.length = length;
    }

    @Override
    public double area() {
        Circle circle = new Circle(radius);
        return circle.area() + (circle.area() * length);
    }
}
