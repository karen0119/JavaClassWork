package class18;

public class Person {  // parent class
    String name;
    void sleep(){
        System.out.println("ZzzZZZz..");
    }
}

class Employee extends Person{  // child class

}

class Tester extends Employee{  // child class

}

class PersonTester{
    public static void main(String[] args) {
        Employee employee=new Employee();   // object 1
        employee.sleep();       // to access methods

        Tester tester=new Tester();   // object 2
        tester.name="Sarah";    // to access instance variable
        tester.sleep();         // to access methods

    }
}