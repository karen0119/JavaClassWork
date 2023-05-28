package class11;

public class E4D2Arrays {
    public static void main(String[] args) {

        // Print only odd number from this 2d array using loops
        // Using Enhanced Loop

        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element % 2 != 0) {  // to print ODDS , remove to print all numbers

                    System.out.println(element);
                }
            }

        }

    }
}
// arr[i] -> gives me array at specific index by i
// first for loop is for rows
// second for loop i for columns