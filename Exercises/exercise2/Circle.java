public class Circle extends ShapeSer {
    private double radius;
    static String name = "Circle";

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    static String getName() {
        return name;
    }
}
