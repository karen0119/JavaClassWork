package class26;

import java.util.HashSet;

public class EntrySetTester {
    public static void main(String[] args) {

        HashSet<Entry> entrySet=new HashSet<>(); // create a hashset

        entrySet.add(new Entry("Coke",2.0));
        entrySet.add(new Entry("Milk",5.0));
        entrySet.add(new Entry("Mango Juice",2.5));

        // 1) enhanced loop to print all items and values
        for(Entry e:entrySet){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        // 2) to remove words that have 'i' and get the value of more than 2.0 then print
        entrySet.removeIf(x->x.getKey().contains("i")&& x.getValue()>2);
        System.out.println(entrySet); // use toString method so the letters print correctly
    }
}
