package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
// Print numbers from 100 to 1
// Print only even numbers from 20 to 100
// Print only odd numbers from 100 to 1
       //task 1
        int counter = 100;
        while (counter >= 1) {
            System.out.print(counter + " ");
            counter--; // use the minus sign to decrease
        }
      // task 2
        counter=20;
        System.out.println();
        while (counter<=100){
            System.out.print(counter+" ");
            counter+=2;
        }

       // task 3
        counter=100;
        System.out.println();
        // YOU NEED to put this so it can print in another line
        while (counter>=1){
            if (counter%2!=0){
                System.out.print(counter+" ");
            }
            counter--;
        }


    }
}
