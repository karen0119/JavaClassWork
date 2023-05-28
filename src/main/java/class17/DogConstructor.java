package class17;

public class DogConstructor {
    /*
    Create 5 objects of this dog class and provide initial values.
    For each object call the printInfo method
     */

    // Attributes,variables
    String name;
    String color;
    String breed;
    int age;

    // methods
    DogConstructor(String dogName, String dogColor, String dogBreed, int dogAge){ //constructor method
        name=dogName;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;
    }

    void printInfo(){                   //void method
        System.out.println(name+" "+color+" "+breed+" "+age);
    }
}
