public class Bicycle {
    String make;
    String model;
    int year;
    String color;
    double price;
    int wheelSize;
    boolean hasGears;
    boolean isElectric;

    Bicycle(String make, String model, String color, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        System.out.println("This is a "+color+" "+make+" "+model+" bicycle, priced $"+price+".");
    }

    public void ride() {
        System.out.println("Riding the bicycle.");
    }

    public void bell() {
        System.out.println("Belling.");
    }

    public void fix() {
        System.out.println("Fixing the bicycle.");
    }

}
