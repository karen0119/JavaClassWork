package class8;

public class E13NestedLoops {
    public static void main(String[] args) {

        /* print this code using loops:
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
         */
        for (int j = 0; j < 3; j++) { // the outside loop will loop 3 times
            for (int i = 1; i <= 5; i++) { // the inside loop will repeat 5 or less numbers
                System.out.print(i + j + " ");

            }
            System.out.println();


        }
    }
}
