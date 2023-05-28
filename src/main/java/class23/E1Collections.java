package class23;

import java.util.ArrayList;

public class E1Collections { // different array examples
    public static void main(String[] args) {

        // array 1
        String name="Vero";
        String name1="RayJay";
        String [] names={"Sarah","Lean"};
        int size=2;

        // array 2
        String [] names2=new String[size];
        names2[0]="Semir";

        // array 3: use this array if you don't know how many elements you will store
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Pavel");
        arrayList.add("Ramil");
        arrayList.add("Axel");
        arrayList.add("Tina");
        System.out.println(arrayList);
    }
}
