package class25;

import java.util.HashMap;

public class E7Maps { //HashMap
    public static void main(String[] args) {

    HashMap<String, Double> grocery=new HashMap<>();

        grocery.put("Apple",2.5);
        grocery.put("Soap",3.1);
        grocery.put("Eggs",3.5);
        grocery.put("Milk",2.5);
        // if we insert the data with the same key again it will override
        grocery.put("Apple",4.5);

        System.out.println(grocery); // {Apple=4.5, Soap=3.1, Eggs=3.5, Milk=2.5}
        System.out.println(grocery.size()); // 4
        System.out.println(grocery.containsKey("Banana")); //false
        System.out.println(grocery.containsKey("Eggs")); //true
        System.out.println(grocery.containsValue(3.5)); //true
        System.out.println(grocery.isEmpty()); //false

  }
}
