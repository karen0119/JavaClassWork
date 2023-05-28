package class9;

public class E11Arrays {
    public static void main(String[] args) {

        /*
        There are two ways of creating arrays
        new int[5] -> create an array of int with size 5

        - this
         */

        int [] numbers= new int[5]; // empty array that will print 5 times
            numbers[0]=100; // store 100 on index 0
            numbers[2]=50; // store 50 on index 2

        for (int number : numbers) {
            System.out.println(number);
            // 0 will print 5 times

        }
    }
}
