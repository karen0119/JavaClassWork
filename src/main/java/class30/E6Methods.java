package class30;

import java.util.ArrayList;
import java.util.List;

public class E6Methods {
    public static void main(String[] args) { // print methods:

        E6Methods e4Methods=new E6Methods(); //  object of class first

        List<Integer> list=new ArrayList<>(); //create arraylist
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(10);

        e4Methods.print(list);

    }
    // create methods:
    void print(List<Integer>list){ //list method
      for (Integer l: list){
          System.out.println(l);
      }
    }
}
