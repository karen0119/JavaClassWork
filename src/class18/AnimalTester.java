package class18;

public class AnimalTester {
    /*
    Create 5 classes of different animals like cat,dog,zebra, camel, horse
    and in each class create 5 fields and 3 methods
     */
    public static void main(String[] args) {

        HorseChildClass horse=new HorseChildClass();  // object for Horse class
        horse.color="Black";
        System.out.println( horse.color="Black"); // prints : Black
        horse.eat();  // prints: eating .....

        CatChildClass cat=new CatChildClass();  // object for Cat classs
        cat.name="Mano";
        cat.sleep(); // Prints: ZZZzzzzZZZzzz.....
        cat.speak();  // Prints: Meow Meow

    }
}
