package pw.adithya.Qn2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DApp {
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
            System.out.printf("1. Square\n2. Rectangle\n3. Circle\n4. Triangle\n\nSelect shape %d: ", (i+1));
            shapeSel = scanner.nextInt();

            switch (shapeSel)
            {
                case 1:
                    System.out.print("Length: ");
                    int length = scanner.nextInt();
                    shapes[i] = new Square(length);
                    break;
                case 2:
                    System.out.print("Length: ");
                    length = scanner.nextInt();
                    System.out.print("Breadth: ");
                    int breadth = scanner.nextInt();
                    shapes[i] = new Rectangle(length, breadth);
                    break;
                case 3:
                    System.out.print("Radius: ");
                    int radius = scanner.nextInt();
                    shapes[i] = new Circle(radius);
                    break;
                case 4:
                    System.out.print("Base: ");
                    int base = scanner.nextInt();
                    System.out.print("Height: ");
                    int height = scanner.nextInt();
                    shapes[i] = new Triangle(base, height);
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
