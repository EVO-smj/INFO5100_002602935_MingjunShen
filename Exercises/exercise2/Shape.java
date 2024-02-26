public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }


    abstract double calculateArea();

    abstract double calculatePerimeter();

    static String name = "Shape";

    static String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
