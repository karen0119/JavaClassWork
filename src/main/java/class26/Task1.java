package class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    /*
     1) Create a map of a building. Store floor number and its associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
            * Check how many entries you have?
            * Update company on a 4th floor
            * Remove company on the 7th floor
            * Print your map
     */
    public static void main(String[] args) {
        Map<Integer,String> company=new LinkedHashMap<>();
        company.put(1,"Google");
        company.put(2,"Syntax");
        company.put(3,"Microsoft");
        company.put(4,"Amazon");
        company.put(5,"Target");
        company.put(5,"Target");
        company.put(7,"Best buy");

        System.out.println(company.size());
        company.replace(4,"Trader Joes");
        company.remove(7);
        System.out.println(company);
    }
}
