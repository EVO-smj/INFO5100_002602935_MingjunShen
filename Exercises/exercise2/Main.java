public class Main {
    public static void main(String[] args) {
        TriangleSer triangleSer = new TriangleSer("White", 3, 4, 5);
        System.out.println("Triangle area: " + triangleSer.calculateArea());
        System.out.println("Triangle perimeter: " + triangleSer.calculatePerimeter());
        System.out.println("Name of this shape class: " + TriangleSer.getName());

        RectangleSer rectangleSer = new RectangleSer("Black", 2, 5);
        System.out.println("Rectangle area: " + rectangleSer.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangleSer.calculatePerimeter());
        System.out.println("Name of this shape class: " + RectangleSer.getName());

        CircleSer circleSer = new CircleSer("Red", 1);
        System.out.println("Circle area: " + circleSer.calculateArea());
        System.out.println("Circle perimeter: " + circleSer.calculatePerimeter());
        System.out.println("Name of this shape class: " + CircleSer.getName());

        SquareSer squareSer = new SquareSer("Blue", 2);
        System.out.println("Square area: " + squareSer.calculateArea());
        System.out.println("Square perimeter: " + squareSer.calculatePerimeter());
        System.out.println("Name of this shape class: " + SquareSer.getName());

        System.out.println("Name of Shape class: " + ShapeSer.getName());
    }
}
