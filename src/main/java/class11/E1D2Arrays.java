package class11;

public class E1D2Arrays {
    public static void main(String[] args) {

        // Print only odd number from this 2d array
        // Using For loops

        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element % 2 != 0) {

                    System.out.println(arr[row][col]);
                }
            }

        }

    }
}
// arr[i] -> gives me array at specific index by i
// first for loop is for rows
// second for loop i for columns