package class7;

public class E12WhileLoop {
    public static void main(String[] args) {
  /* Add all the numbers from 1 to 10 and display the result 55:
  - First write a loop that goes from 1 to 10
  - Second create a variable to hold the sum and add all the numbers
    to that variable in each iteration*/

        int counter=1;
        int sum=0;
        while (counter<=10){
            sum+=counter; // same as sum+=counter
            counter++;
        }
        System.out.println(sum);



    }
}
