package class12;

public class Car {
    // Define 5 properties and 3 methods

    String model;
    String color;
    boolean isFast;
    int miles;
    int year;


    void moves() {
        System.out.println("Brooooomm...");
    }

    void stopCar() {
        System.out.println("Applying the brakes to stop " + model);
    }

    void turn() {
        System.out.println("Turning the steering wheel");
    }

}
