package class11;

public class E3D2Array {
    public static void main(String[] args) {

        // Way 2 to print all elements
        // Using enhanced Loop

        String[][] names2Darray = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };

        for (String[] name1DArr : names2Darray) {
            for (String name : name1DArr) {
                System.out.println(name);
            }
        }

    }
}