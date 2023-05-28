package class21;

public class Parent {  // parent class

    // Example of final keyword
   final int noOfMonthsInYear=12; //CANNOT change this variable either b/c final keyword
   final void getMarry(){  // CANNOT override this method b/c final keyword
        System.out.println("Marry ");
    }
    void study(){  // CAN override this method
        System.out.println("Study medicine");
    }
}
class Axel extends Parent {  // child class
    final int noOfHoursInDay=24;  //CANNOT change this variable either b/c final keyword
    @Override
    void study(){
        System.out.println(noOfMonthsInYear); // can access it but cannot change it
        System.out.println("No I want SDET");
    }
}
