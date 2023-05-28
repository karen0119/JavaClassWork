package class18;

public class Honda extends Vehicle {
    // child class 1
}

class BMW extends Vehicle{
    // child class 2
    void offerMPackage(){
        System.out.println("Only BMW offers the M package");
    }
}
class Audi extends Vehicle{
    //child class 3
}
class vehicleTester{
    // class tester
    public static void main(String[] args) {
        Honda honda=new Honda();
        honda.stopCar();
    }
}
