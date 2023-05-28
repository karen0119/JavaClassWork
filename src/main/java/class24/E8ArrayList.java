package class24;

import java.util.ArrayList;

public class E8ArrayList {
    /*
    Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your ArrayList and print all values from that
    */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Marin");
        names.add("Vlad");
        names.add("Zak");
        names.add("Alina");
        names.add("Axel");

        System.out.println(names.isEmpty()); //to check if it's empty
        System.out.println(names.contains("Alina")); // to check in a name is present
        System.out.println(names.size());  // to print the size
        System.out.println(names); // to print all values
    }
}
