package class21;

class Animal{  // parent class
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;

    }
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep from 1 to 20 hours a day");
    }
    void eat(){
        System.out.println("Animals eat many different things");
    }
}
class Cat extends Animal{  // child class
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    void speak(){
        System.out.println("Meow meow...");
    }
    @Override
    void eat(){
        System.out.println("Cats like to eat fish");
    }
    @Override
    void sleep(){
        System.out.println("Cats like to sleep 15 hours on average");
    }
}
public class Dog extends Animal {  // child class
    public Dog(String name, String color, String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Woof woof...");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew the bones");
    }
    void run(){
        System.out.println("Dog can run fast");
    }
}
class Horse extends Animal{  // child class
    public Horse (String name, String color, String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Neahh Neaah...");
    }
    @Override
    void eat(){
        System.out.println("Horse like carrots and grass");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 2-3 hours");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Shaggy","black","German");
        dog.printInfo();  // Shaggy black German

        // Parent class variables can store the objects of the child classes
        Animal dog1= new Dog ("Marley","brown","golden retriever");
        dog1.printInfo();

        Animal [] animals={new Dog("Marley","brown", "golden retriever"), new Cat("Tom","Blue","persian")};

        for (Animal animal: animals){
            animal.printInfo();
        }

        // type casting(widening) finish code
    }
}
