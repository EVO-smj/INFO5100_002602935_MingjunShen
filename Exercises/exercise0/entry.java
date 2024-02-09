
public class entry {
    public static void main(String[] args) {

        Chair chair1 = new Chair("wood", "white", 12.5);
        Chair chair2 = new Chair("plastic", "black", 150.3);
        Chair chair3 = new Chair("wood", "white", 116.5);
        chair1.move();
        chair2.sit();
        chair3.adjustHeight();

        Table table1 = new Table("wood", "oak", 150);
        Table table2 = new Table("plastic", "white", 45.5);
        Table table3 = new Table("mixed", "coffee", 99.9);
        table1.move();
        table2.putThings();
        table3.adjustHeight();

        Book book1 = new Book("Harry Porter", "JK R", 45.6, 1000);
        Book book2 = new Book("The Little Prince", "Antoine", 12.3, 100);
        Book book3 = new Book("Python Crash Course", "Eric", 56.6, 600);
        book3.open();
        book1.close();
        book2.read();

        Pen pen1 = new Pen("black", 0.7, true);
        Pen pen2 = new Pen("red", 0.5, false);
        Pen pen3 = new Pen("blue", 1.0, false);
        pen3.spin();
        pen2.write();
        pen1.refill();

        Car car1 = new Car("Toyota", "Corolla", "white", 2023);
        Car car2 = new Car("Tesla", "model 3", "blue", 2022);
        Car car3 = new Car("Hoada", "Civic", "red", 2024);
        car3.start();
        car2.brake();
        car1.drive();

        Bicycle bicycle1 = new Bicycle("Giant", "N21", "black", 499.9);
        Bicycle bicycle2 = new Bicycle("Phoenix", "F2", "red", 199.9);
        Bicycle bicycle3 = new Bicycle("Decathlon", "D9", "white", 299.9);
        bicycle3.ride();
        bicycle2.bell();
        bicycle1.fix();

        Television tv1 = new Television("Sony", "X90", 85);
        Television tv2 = new Television("LG", "L80", 75);
        Television tv3 = new Television("Samsung", "S21", 99.9);
        tv1.start();
        tv2.sleep();
        tv3.watch();

        Smartphone phone1 = new Smartphone("Apple", "14", "pink");
        Smartphone phone2 = new Smartphone("Samsung", "S21", "black");
        Smartphone phone3 = new Smartphone("LG", "123", "white");
        phone3.call();
        phone2.surf();
        phone1.sendMessage();


        Laptop laptop1 = new Laptop("Apple", "Macbook Air", "silver");
        Laptop laptop2 = new Laptop("Lenovo", "Y7000", "black");
        Laptop laptop3 = new Laptop("Samsung", "S21", "white");
        laptop1.start();
        laptop2.reboot();
        laptop3.fold();

        Pet pet1 = new Pet("cat", "white", "Xiaosong", "girl", 3,8.6);
        Pet pet2 = new Pet("cat", "grey", "Dazao", "boy", 3, 10.6);
        Pet pet3 = new Pet("dog", "mixed","Sanji", "boy", 4, 15);
        pet3.roll();
        pet2.come();
        pet1.sit();
    }
}
