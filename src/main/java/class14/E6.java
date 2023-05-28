package class14;

public class E6 {
    /*    create a method which returns true or false and takes an int
    number as a parameter. if number is
    even it returns true otherwise it returns false.
    Name of the method should be isEven */

    // These are the methods
    boolean isEven(int number) {
        boolean isNumEven = false;
        if (number % 2 == 0) {
            isNumEven = true;
        }
        return isNumEven;
        // return number%2==0;  <-- quicker logic
    }
    // This is the object class
    public static void main(String[] args) {
        E6 obj = new E6();
        System.out.println(obj.isEven(15)); //false
    }

}
