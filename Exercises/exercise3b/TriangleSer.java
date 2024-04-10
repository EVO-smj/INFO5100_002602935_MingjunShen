import java.io.*;

public class TriangleSer extends ShapeSer implements Serializable {
    private double side1, side2, side3;
    static String name = "Triangle";

    public TriangleSer(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    static String getName() {
        return name;
    }
}
