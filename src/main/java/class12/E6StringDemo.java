package class12;

public class E6StringDemo {
    public static void main(String[] args) {

        String name="Justin";

        System.out.println(name.equals("Axel")); //prints false
        System.out.println(name.equals("Justin")); // prints true
        System.out.println(name.equalsIgnoreCase("JUSTIN")); //prints true
        System.out.println(!name.equalsIgnoreCase("JUSTIN")); //prints false

    }
}
