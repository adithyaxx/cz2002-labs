package pw.adithya.Qn2;

public class Cone implements Shape {
    private int radius, length;

    public Cone(int radius, int length) {
        this.radius = radius;
        this.length = length;
    }

    @Override
    public double area() {
        return 3.14 * radius * length;
    }
}
