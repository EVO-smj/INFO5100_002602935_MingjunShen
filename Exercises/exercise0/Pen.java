public class Pen {
    String brand;
    String color;
    String type;
    double length;
    double tipSize;
    boolean isRefillable;
    boolean hasCap;
    double price;

    Pen(String color, double tipSize, boolean isRefillable) {
        this.color = color;
        this.tipSize = tipSize;
        this.isRefillable = isRefillable;
        if (this.isRefillable) {
            System.out.println("This is a refillable " +color+" "+tipSize+"mm pen.");}
        else {
            System.out.println("This is a unrefillable " +color+" "+tipSize+"mm pen.");
        }

    }

    public void write() {
        System.out.println("Using the pen to write.");
    }

    public void spin() {
        System.out.println("Spinning the pen.");
    }

    public void refill() {
        System.out.println("Refilling the pen.");
    }
}
