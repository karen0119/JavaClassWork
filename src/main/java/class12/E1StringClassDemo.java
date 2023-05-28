package class12;

public class E1StringClassDemo {
    public static void main(String[] args) {

        // Create the object of that class
        /*      syntax for string class:
           1) ClassName objectName = new ClassName();
           2) String s=new String ("Ana");
           3) down below
         */

        String string1 = "Ana"; // most widely used syntax for string class
        System.out.println(string1.length()); // There are 3 letters in Ana

        String name = "Axelitbog Vneoemefn";
        if (name.length() > 8) {
            System.out.println("Only 8 characters are allowed");
        }
    }
}
