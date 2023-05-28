package class15;

import java.util.Arrays;

public class E1Methods {
    /*
  The createArray(size) method takes an integer parameter size and
  creates an array of that size. It then fills the array with the number
  10 using a for loop, and finally returns the array.
   */
    // return type --> array
    // method name --> createArray
    //parameter --> just 1 ( int size)
    int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=10;
        }
        return arr;
    }

    public static void main(String[] args) {

        E1Methods e1=new E1Methods();
        int [] array =  e1.createArray(5);

        System.out.println(Arrays.toString(array)); // <-- one way of printing the code
         // (Array is a built-in class)

       /* for (int i : array) {
            System.out.println(i); <-- second way of printing the code */

       /* for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);  <-- third way of printing the code */
        }
        }


