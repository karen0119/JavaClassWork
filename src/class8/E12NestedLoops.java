package class8;

public class E12NestedLoops {
    public static void main(String[] args) {
        /*
        0 1 2 3 4
        0 1 2 3 4
        0 1 2 3 4
        0 1 2 3 4
        0 1 2 3 4
         */

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
