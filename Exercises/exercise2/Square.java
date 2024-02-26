public class Square extends Shape {
    private double side;
    static String name = "Square";

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

    static String getName() {
        return name;
    }
}
