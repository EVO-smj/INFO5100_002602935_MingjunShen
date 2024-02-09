public class Chair {

        String material;
        String brand;
        String color;
        double price;
        double height;
        double length;
        double width;
        boolean isAdjustable;

        Chair(String material, String color, double price) {
            this.color = color;
            this.material = material;
            this.price = price;
            System.out.println("A new "+color+" "+material+ " chair instance created.");
        }

        public void sit() {
            System.out.println("Sitting on the chair.");
        }

        public void adjustHeight() {
            System.out.println("Adjusting chair height.");
        }

        public void move() {
            System.out.println("Moving the chair position.");
        }
}
