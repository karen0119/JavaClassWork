package class17;

public class PersonConstructor {
    /*              Task1:
    Write a java class that will have a constructor:
    One with parameters and second without any parameters.
    Create a separate Test class where you will
    execute both of the constructors 1 by 1
     */

    String name;

    // constructor with parameters
    PersonConstructor(String personName){
        System.out.println("1 parameter");
    }

    // constructor with NO parameters
    PersonConstructor(){
        System.out.println("No parameter");
    }
}
