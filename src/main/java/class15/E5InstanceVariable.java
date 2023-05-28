package class15;

public class E5InstanceVariable {
    // Instance variables can only be accessed inside instance methods
    String name; // instance variable -> can be used w/out initializing
    void print(){
        int age=18;
        System.out.println(name);
    }

    void printInfo(){
        System.out.println(name); // instance variable can be reused in another method
    }

    static void printName(){
      //  System.out.println(name); <-- instance will NOT print in static method

    }
    public static void main(String[] args) {
        System.out.println(Math.E); //2.718281828459045
    }
}
