package class20;

public class Main {

    // You CAN overload main method too
    public static void main(String[] args) {
        main();  // prints: No parameter
        main(2);  // prints: int argument
    }

    public static void main() {
        System.out.println("No parameter");
    }
    public static void main(int number) {
        System.out.println("int argument ");
    }
}
