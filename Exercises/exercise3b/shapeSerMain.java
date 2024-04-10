import java.io.*;


public class shapeSerMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TriangleSer triangleSer = new TriangleSer("White", 3, 4, 5);
        System.out.println("Shape: " + TriangleSer.getName() + ", Area: " + triangleSer.calculateArea()+ ", Perimeter: " + triangleSer.calculatePerimeter());

        RectangleSer rectangleSer = new RectangleSer("Black", 2, 5);
        System.out.println("Shape: " + RectangleSer.getName() + ", Area: " + rectangleSer.calculateArea()+ ", Perimeter: " + rectangleSer.calculatePerimeter());

        CircleSer circleSer = new CircleSer("Red", 1);
        System.out.println("Shape: " + CircleSer.getName() + ", Area: " + circleSer.calculateArea()+ ", Perimeter: " + circleSer.calculatePerimeter());

        SquareSer squareSer = new SquareSer("Blue", 2);
        System.out.println("Shape: " + SquareSer.getName() + ", Area: " + squareSer.calculateArea()+ ", Perimeter: " + squareSer.calculatePerimeter());

        FileOutputStream fileOut = new FileOutputStream("Shape.ser");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(triangleSer);
        objOut.writeObject(rectangleSer);
        objOut.writeObject(circleSer);
        objOut.writeObject(squareSer);
        objOut.flush();
        objOut.close();
        System.out.println("\nSerialization finished.\n");

        System.out.println("Start Deserialization...");

        FileInputStream fileIn = new FileInputStream("Shape.ser");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        System.out.println("\nDeserialization data:\n");


        TriangleSer triangleDeser = (TriangleSer) objIn.readObject();
        System.out.println("Shape: " + TriangleSer.getName() + ", Color: " + triangleDeser.getColor() + ", Area: " + triangleDeser.calculateArea() + ", Perimeter: " + triangleDeser.calculatePerimeter());

        RectangleSer rectangleDeser = (RectangleSer) objIn.readObject();
        System.out.println("Shape: " + RectangleSer.getName() + ", Color: " + rectangleDeser.getColor() + ", Area " +rectangleDeser.calculateArea() + ", Perimeter: " + triangleDeser.calculatePerimeter());

        CircleSer circleDeser = (CircleSer) objIn.readObject();
        System.out.println("Shape: " + CircleSer.getName() + ", Color: " + circleDeser.getColor() +  ", Area: " + circleDeser.calculateArea()+ ", Perimeter: " + circleDeser.calculatePerimeter());

        SquareSer squareDeser = (SquareSer) objIn.readObject();
        System.out.println("Shape: " + SquareSer.getName() + ", Color: " + squareDeser.getColor()  + ", Area: " + squareDeser.calculateArea()+ ", Perimeter: " + squareDeser.calculatePerimeter());

        objIn.close();

    }
}
