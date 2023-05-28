package class18;

public class Furniture {  // parent class
    String color="Black";
}

class Chair extends Furniture {  //child class
    String color="White";  //local variable

    void printColor(){      //method
        String color="Blue";
        System.out.println(color); // to access local variable of **method
        System.out.println(this.color);  // to access instance variable of **child class
        System.out.println(super.color);  // to  access instance variable of **parent class

    }
}

class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
      //  chair.printColor(); // to access variables
        chair.printColor(); // prints: Blue , White, Black

    }
}
