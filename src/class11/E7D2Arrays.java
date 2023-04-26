package class11;

public class E7D2Arrays {
    public static void main(String[] args) {
        /* With the help of loops count how many times
         we have true in or 2DArray */


        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}
        };
        int counter = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean bool : arr1D) {
                if (bool) {
                    counter++;

                }
            }

        }
        System.out.println("counter = " + counter);
    }


}



