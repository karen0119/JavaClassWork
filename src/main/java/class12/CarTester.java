package class12;

public class CarTester {
    public static void main(String[] args) {

        // below code will create an object of car class

        // Car 1
        Car car = new Car();
        car.model = "Toyota";
        car.color = "Red";
        car.miles = 0;
        car.year = 2021;
        car.isFast = true;
        car.stopCar();
        car.turn();
        car.moves();

        // Car 2
        Car car1 = new Car();
        car1.model = "BMW";
        car1.color = "Black";
        car1.miles = 1_000;
        car1.isFast = true;
        car1.stopCar();
        car1.turn();
        car1.moves();

    }
}
