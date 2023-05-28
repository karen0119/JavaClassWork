package class26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E1Maps {
    // Store the prices and names of the items --> use Map
    public static void main(String[] args) {

        Map<String, Double> drinks=new HashMap<>();

        drinks.put("Coke",2.0);
        drinks.put("Milk",5.0);
        drinks.put("Mango juice",2.5);
        drinks.put("Coffee",3.0);
        drinks.put("Tea",3.5);

        // 1) remove if it has a letter "i"
        drinks.keySet().removeIf(x->x.contains("i"));
        System.out.println(drinks);

        // 2) remove if it has a value of more than 3.0
        drinks.values().removeIf(x->x>3.0);
        System.out.println(drinks);

        // 3) print all items and values
        Set<Map.Entry<String, Double>> entrySet= drinks.entrySet();
        for(Map.Entry<String, Double> e:entrySet){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        // 4) Remove all the entries for which key contains the letter i
        // and value is greater than 2
        entrySet.removeIf(x->x.getKey().contains("i")&& x.getValue()>2);



    }
}
