package class18;

public class Dog {
                // instance variables/ attributes / fields
    String name;
    String color;
    String breed;
    int age;
    double weight;

                 // constructor method 1
    Dog(String name, String color, String breed, int age, double weight){
        /* this.name=name;
         this.color=color;
         this.breed=breed;
         this.age=age; */
         this(name, color, breed, age); // quick way to call the parameters
         this.weight=weight;  // can't include this one because the other constructor doesn't have it


    }
    // reusing the method constructors to reduce code
    Dog(String name, String color, String breed, int age){

        /*this.name=name;
        this.color=color;
        this.breed=breed; */
        this(name, color, breed);
        this.age=age;
    }
    Dog(String name, String color, String breed){

         this.name=name;
        this.color=color;
        this.breed=breed;

    }



}
