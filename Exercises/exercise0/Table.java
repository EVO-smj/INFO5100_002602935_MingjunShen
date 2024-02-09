public class Table {

    String material;
    String brand;
    String color;
    double price;
    double height;
    double length;
    double width;
    boolean isAdjustable;

    Table(String material, String color, double price) {
        this.color = color;
        this.material = material;
        this.price = price;
        System.out.println("A new "+color+" "+material+ " Table instance created.");
    }

    public void putThings() {
        System.out.println("Putting things on the Table.");
    }

    public void adjustHeight() {
        System.out.println("Adjusting Table width.");
    }

    public void move() {
        System.out.println("Moving the Table position.");
    }
}
