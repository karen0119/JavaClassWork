package class26;

import java.util.TreeMap;

public class Task2 {
    /*
   2) Create a map of 5 countries with its capital that will store countries in alphabetical order.
        * Print all keys and values from a country map using for each loop.
        * Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","DC");
        countries.put("Canada","Montrial");
        countries.put("Egypt","Cairo");
        countries.put("France","Paris");
        countries.put("England","London");
        //  Set<String> countrySet=countries.keySet();
        for (String s : countries.keySet()) {
            System.out.println(s);
        }
        System.out.println("******************");
        for(String v:countries.values()){
            System.out.println(v);
        }
        System.out.println("******************");
        // Var keyword is used here instead of typing Map.Entry<String,String>
        for(var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }

}
