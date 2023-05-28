package class13;

public class MethodTester {
    public static void main(String[] args) {

        // Result to Method 1
        MethodPrinter str=new MethodPrinter();
        str.printSomething(); // prints java 4 times
        str.printSomething(); // prints java 8 times

        // Result to Method 2
        MethodPrinter.printWord("Darko"); // prints Dark 4 times
        MethodPrinter.printWord("Artem"); // prints it 4 times too

        // Result to method 3
        MethodPrinter.printWordManyTimes("Lean",3); // prints Lean 3 times

    }
}
