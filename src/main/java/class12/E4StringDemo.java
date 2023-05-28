package class12;

public class E4StringDemo {
    public static void main(String[] args) {
// String concat example
        String firstName="Ana";
        String lastName="Tasevska";

        String fullName= firstName+lastName; // Most widely used approach to print
        System.out.println(fullName);      // first and last name

        System.out.println(firstName.concat(lastName)); // won't work all the time
                                                    // if there's no last name
    }
}
