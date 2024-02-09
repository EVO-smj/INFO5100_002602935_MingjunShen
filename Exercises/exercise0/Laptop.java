public class Laptop {
    String brand;
    String model;
    double screenSize;
    String color;
    double price;
    int batteryVolume;
    String serialNumber;
    boolean hasGraphCard;

    Laptop(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        System.out.println("My Laptop is a "+color+" "+brand+" "+model+".");
    }

    public void start() {
        System.out.println("Starting the laptop");
    }

    public void reboot() {
        System.out.println("Rebooting the laptop.");

    }

    public void fold () {
        System.out.println("Folding the laptop.");}

}
