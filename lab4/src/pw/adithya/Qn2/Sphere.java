package pw.adithya.Qn2;

public class Sphere implements Shape {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        Circle circle = new Circle(radius);

        return 4 * circle.area();
    }
}
