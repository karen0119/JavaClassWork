package class23;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Moncef");
        names.add("Vlad");
        names.add("Axel");
        names.add("Marina");
        System.out.println(names);  // print all names
        System.out.println(names.size());  // how many names are in the array
        System.out.println(names.contains("Vlad")); // true or false value
        System.out.println(names.get(0)); // what name is at index 0
        names.remove("Vlad");  // remove name Vlad
        System.out.println(names);  // Prints without name Vlad
    }
}
