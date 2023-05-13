package class17;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;

    // this keyword to access instance variables with same name
    Car(String make, String model, int engineCC,String color){
        this.make=make;
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car car=new Car("Honda","civic",1800,"white");
        car.printInfo();
        // prints: Honda civic 1800 white
    }
}
