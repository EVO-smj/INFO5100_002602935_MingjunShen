public class Television {
    String brand;
    String model;
    double screenSize;
    String color;
    double price;
    double thickness;
    String serialNumber;
    boolean hasDPPort;

    Television(String brand, String model, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        System.out.println("My tv is a "+screenSize+" inches "+brand+" "+model+".");
    }

    public void start() {
        System.out.println("Starting the tv");
    }

    public void watch() {
        System.out.println("Watching the tv.");

    }

    public void sleep () {
        System.out.println("Sleeping the tv.");}

}
