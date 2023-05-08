package class17;

public class Zebra {
    // instance variables
    String name;
    String color;
    int age;
    double weight;
    // static variable
    static int noOfLegs=4;

    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){  // instance method (instance variables are involved and cannot use static variable here)
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
    static void speak(){  // static method (instance variables are not involved) ** used mainly **
        System.out.println("bahaha");

    }

    public static void main(String[] args) {
       
    }
}
