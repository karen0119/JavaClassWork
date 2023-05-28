package class14;

public class E5ArrayUtils {
        /*
    Create a method, call it contains. It should take an array of int and an
    int number in the method body. It should search the array for that number,
    if number is present in the array method should return true, otherwise method
    should return false. In a separate class call the method and test it for below
    input {10,20,45} number 20
    15
     */
    /*
    1) name of method =>contains
    2) parameters => int [] arr, int num
    3) return type => boolean
    4) body => {
    for loop
    if conditions
    }
     */
            // Methods
    boolean contains(int[] arr, int num) {
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {

            }
        }
        return isFound;

    }
}
