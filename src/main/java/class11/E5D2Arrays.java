package class11;

public class E5D2Arrays {
    public static void main(String[] args) {
        //Using the help of loop count how many numbers in above array are even


        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        int counter=0;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element % 2 == 0) {  // to print even
                        counter++;

                }
            }

        }
        System.out.println("counter = " + counter);
    }
}
