public class Car {
    String make;
    String model;
    int year;
    String color;
    double price;
    double mileage;
    boolean isAutomatic;
    boolean isFourWheelDrive;

    Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        System.out.println("This is a "+color+" "+make+" "+model+" "+year+" car.");
    }

    public void start() {
        System.out.println("Starting the car.");
    }

    public void brake() {
        System.out.println("Braking the car.");
    }

    public void drive() {
        System.out.println("Driving the car.");
    }

}

