package class25;

import java.util.TreeSet;

public class E5Sets { //TreeSet
    public static void main(String[] args) {

        // TreeSet prints no duplicates and sorts the data in order
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
    }
}
