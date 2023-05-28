package class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(200);

        System.out.println(numbers); // directly printing values
        System.out.println("***********************");

        for(Integer num:numbers){  // Enhance for loop to print values
            System.out.println(num);
        }
        System.out.println("***********************");
        for (int i = 0; i <numbers.size() ; i++) { // Normal for loop to print values
            System.out.println(numbers.get(i));
        }
        System.out.println("***********************");
        int i=0;
        while (i<numbers.size()){  // While loop to print values
            System.out.println(numbers.get(i));
            i++;
        }
        System.out.println("***********************");
        int j=0;
        do{                      // Do while loop to print values
            System.out.println(numbers.get(j));
            j++;
        }while (j<numbers.size());

            }

    }

