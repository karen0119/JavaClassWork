package class18;

public class Car {
            //instance variables / attributes / fields
    String make;
    String model;
    String color;
    int year;
    int engineCC;

            // constructor methods
    Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }
            //reuse the code with the help of another constructor
    Car (String make, String model, String color, int year){
        this(make, model, color);   //needs to go first otherwise will get an error
        this.year=year; //this code is not used before so make a new this
    }

}
