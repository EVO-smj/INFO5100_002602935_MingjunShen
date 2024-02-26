public class Rectangle extends Shape {
    private double length, width;
    static String name = "Rectangle";

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    static String getName() {
        return name;
    }
}
