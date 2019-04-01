package pw.adithya.Qn2;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int noOfShapes = 0;
        int shapeSel = 0;

        System.out.print("Enter the total number of shapes: ");
        noOfShapes = scanner.nextInt();

        Shape[] shapes = new Shape[noOfShapes];

        for (int i=0; i < noOfShapes; i++)
        {
            System.out.printf("1. Cube\n2. Cuboid\n3. Sphere\n4. Pyramid\n5. Cone\n6. Cylinder\n\nSelect shape %d: ", (i+1));
            shapeSel = scanner.nextInt();

            switch (shapeSel)
            {
                case 1:
                    System.out.print("Length: ");
                    int length = scanner.nextInt();
                    shapes[i] = new Cube(length);
                    break;
                case 2:
                    System.out.print("Length: ");
                    length = scanner.nextInt();
                    System.out.print("Breadth: ");
                    int breadth = scanner.nextInt();
                    shapes[i] = new Cuboid(length, breadth);
                    break;
                case 3:
                    System.out.print("Radius: ");
                    int radius = scanner.nextInt();
                    shapes[i] = new Sphere(radius);
                    break;
                case 4:
                    System.out.print("Base: ");
                    int base = scanner.nextInt();
                    System.out.print("Height: ");
                    int height = scanner.nextInt();
                    shapes[i] = new Pyramid(base, height);
                    break;
                case 5:
                    System.out.print("Base: ");
                    base = scanner.nextInt();
                    System.out.print("Length: ");
                    length = scanner.nextInt();
                    shapes[i] = new Cone(base, length);
                    break;
                case 6:
                    System.out.print("Radius: ");
                    radius = scanner.nextInt();
                    System.out.print("Length: ");
                    length = scanner.nextInt();
                    shapes[i] = new Cylinder(radius, length);
                    break;
            }
        }

        double totalArea = 0;

        for (int i=0; i < noOfShapes; i++)
        {
            totalArea += shapes[i].area();
        }

        System.out.printf("Total Area: %.2f", totalArea);
    }
}
