package class11;

public class E2D2Array {
    public static void main(String[] args) {

        // Way 1 to print all elements

        String[][] names = {{"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };

        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[row].length; col++) {
                System.out.println(names[row][col]);
            }
        }
    }
}