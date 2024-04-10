import java.io.*;

public abstract class ShapeSer implements Serializable {
    protected String color;

    public ShapeSer(String color) {
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
