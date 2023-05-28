package class19;

public class MathMethodOverloading {

    // Method overloading example: we must have different
    // 1) number of parameters 2) data types of parameters 3) sequence of dataTypes
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(int num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num2, int num1) {
        System.out.println(num1 + num2);
    }

    static void add(long num1, long num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public static void main(String[] args) {

        //addOneIntOneDouble()
        add(10, 10);  // 20
        add(10, 20.5); // 30.5
        add(2.5, 2.5); // 5.0
        add(111111111L, 3333L); // 111114444
        add(10.5, 20); //30.5


    }
}


