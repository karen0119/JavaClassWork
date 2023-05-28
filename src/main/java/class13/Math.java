package class13;

public class Math {
// This is the class name --> Math
// also defining Method like Printer
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }
// This is the object of Math class
// also Method Tester
    public static void main(String[] args) {
        Math math=new Math();
        math.add(10,10); // prints 20
        math.multiply(5,5); // prints 25
    }
}
