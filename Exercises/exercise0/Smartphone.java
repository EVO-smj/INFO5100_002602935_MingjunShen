public class Smartphone {
    String brand;
    String model;
    double screenSize;
    String color;
    double price;
    String serialNumber;
    boolean hasFingerprint;
    boolean isWaterProof;

    Smartphone(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        System.out.println("My Phone is a "+color+" "+brand+" "+model+".");
    }

    public void call() {
        System.out.println("Making a call.");
    }

    public void sendMessage() {
        System.out.println("Sending a message.");

        }

    public void surf () {
        System.out.println("Surfing the Internet.");}

    public static class operatingSystem {
        String name;
        double version;


        public operatingSystem(String name, double version) {
            this.name = name;
            this.version = version;
            System.out.println("This phone uses " + name + " Ver." + version + " operating system.");
        }

        public void upgrade() {
            System.out.println("Upgrading system.");
        }

        public void reboot() {
            System.out.println("Rebooting system.");
        }

        public void reset() {
            System.out.println("Resetting system.");
        }
    }
    }

