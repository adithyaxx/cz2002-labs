package pw.adithya.Qn2;

public class Pyramid implements Shape{
    private int base, height;

    public Pyramid(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        Triangle triangle = new Triangle(base, height);
        return 4 * triangle.area();
    }
}
