public class Pet {
    String name;
    String color;
    String type;
    String gender;
    double age;
    double height;
    double weight;
    double price;


    Pet(String type, String color, String name, String gender, double age, double weight){
        this.color = color;
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;

        System.out.println("This is my "+color+" "+type+", "+name+". This "+gender+" is "+age+" yo and "+weight+" lbs.");
    }

    public void come(){
        System.out.println("Come! Good girl/boy!");

    }
    public void sit(){
        System.out.println("Sit! Good girl/boy!");

    }
    public void roll(){
        System.out.println("Roll! Good girl/boy!");

    }

}
