public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("White", 3, 4, 5);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Name of this shape class: " + Triangle.getName());

        Rectangle rectangle = new Rectangle("Black", 2, 5);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Name of this shape class: " + Rectangle.getName());

        Circle circle = new Circle("Red", 1);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Name of this shape class: " + Circle.getName());

        Square square = new Square("Blue", 2);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
        System.out.println("Name of this shape class: " + Square.getName());

        System.out.println("Name of Shape class: " + Shape.getName());
    }
}
