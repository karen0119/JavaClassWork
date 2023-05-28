package class21;

public class E1Poly {
    public static void main(String[] args) { // extends from Animal Parent Class

        // Print all methods in animal class

        Animal [] animals={new Dog("Kantoor","black","german"),
                new Cat("Pesho","Grey","italian"),
                new Horse("Kal","black","turkish") };

        for (Animal animal: animals){  // use ENHANCED LOOP to go through array
            animal.speak(); // prints all speak methods in animal class
            animal.eat(); // prints all eat methods in animal class
            animal.sleep(); // prints all sleep methods in animal class
        }


       Animal dogStoredInAnimal = new Dog("Kantoor","black","golden");
        //we must type cast the dogStoredInAnimal back to a dog to call the run method
        //as this run method only exits in the Dog class.
        Dog d = (Dog) dogStoredInAnimal;
        d.run();
        // direct way without using a variable
        ((Dog)dogStoredInAnimal).run();

        int num = (int) 10.5;



    }
}

