package class11;

public class E6D2Arrays {
    public static void main(String[] args) {
        //Using the help of enhanced for loop


        int[][] arr2D = {
                {10, 20, 30, 40, 50}, // print 150
                {1, 2, 3, 4, 5}, // print 15
                {5, 5, 5, 5, 5}, //print 25
                {10, 8, 6, 4, 2} // print 30
        };
        int sum = 0;
        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {
                sum = sum + num;

            }
            System.out.println(sum);
            sum = 0;
        }

    }

}

