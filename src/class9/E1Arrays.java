package class9;

public class E1Arrays {
    public static void main(String[] args) {

        /*
        String -> data type
        [] ->  this is a part of the syntax
        names-> a variable or name of the array
        = -> assignment operator
        {} -> one of the ways to create arrays
         */

        //Example 1

        String[] names = {"Jacob", "Lean", "Pavel"};
        //[0] = Jacob, [1] = Lean [2] = Pavel

        System.out.println(names[0]); //Jacob will print
        System.out.println(names[1]); //Lean will print

        System.out.println(); // Line SPACE

        //Example 2

        int[] numbers = {30, 40, 50, 90};
        System.out.println(numbers[2]); // 50 will print

    }
}
