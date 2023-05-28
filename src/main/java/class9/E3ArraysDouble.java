package class9;

public class E3ArraysDouble {
    public static void main(String[] args) {

        double[] numbers = {10.5, 5.5, 0.05, 100.5, 586};

        System.out.println(numbers.length); // You can REMOVE to NOT print count

        //numbers.length gives total count of indexes/elements in an array

        for (int i = 0; i < numbers.length ; i++) {

            System.out.print(numbers[i]+" ");
            // ALL indexes will print
            // put +" " to make space and remove LN to print single line
        }


    }
}
