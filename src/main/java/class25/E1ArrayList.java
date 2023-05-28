package class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        /*
        ArrayList is a class (It's part of the collection framework)
        <> These are called angle brackets or diamond operators. We
        write the name of the class whose objects we are planning to store in
        an arrayList
         */

        // creating the object of the car class and storing it in a variable car1
        Car car1=new Car("Toyota","Prius");
        Car car2=new Car("Honda","Civic");
        Car car3=new Car("BMW","Nissan");

        // creating and storing in an arrayList
        ArrayList<Car> arrayList=new ArrayList<>();
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);

        // enhanced loop to go through the arrayList
        for(Car c: arrayList){
            c.printInfo();
        }
    }
}
class Car{
    // variables to store data
    String make;
    String model;

    // creating a construction method
    Car(String make,String model){
        this.make=make;
        this.model=model;
    }
    // creating a print method
    void printInfo(){
        System.out.println(make+" "+model);
    }

}