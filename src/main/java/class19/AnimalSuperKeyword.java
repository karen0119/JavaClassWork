package class19;
// create 3 classes like Dog, Cat, Horse define 5 properties in each class
//     *** hint: you can use inheritance to avoid code duplication
// and one printInfo method that will print the values of these variables.
// create constructors as well in each child class to initialize those
// properties create one object of each class and call the printInfo method
public class AnimalSuperKeyword {  // parent class
    private String name;
    private String color;
    private String breed;
    private int age;
    private double weight;

    // constructor
    public AnimalSuperKeyword(String name, String color, String breed, int age, double weight) {

        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {  // printInfo method
        System.out.println(name + " " + color + " " + breed + " " + age + " " + weight);
    }


}

class Dog extends AnimalSuperKeyword {  //child class 1
    double price;

    public Dog(String name, String color, String breed, int age, double weight, double price) {
        super(name, color, breed, age, weight);
        this.price = price;  // assigning the price
    }
    void printInfo(){
        super.printInfo(); // print info from the parent class
        System.out.println(price);  // to print the price variable
    }
}

class Cat extends AnimalSuperKeyword {  // child class 2

    public Cat(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}

class Horse extends AnimalSuperKeyword {  // child class 3

    public Horse(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Tom","Black","persian",10,20,200);
        dog.printInfo();
    }
}

