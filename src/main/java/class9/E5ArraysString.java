package class9;

public class E5ArraysString {
    public static void main(String[] args) {

        String[] names = {"Karen", "Lean", "Pavel", "May", "Alex"};

        //Example using for loop

        for (int i = 0; i < names.length ; i++) {

            System.out.print(names[i]+" "); // all elements will print

        }

        //Example using while loop

        System.out.println(); // to make a line space
        int counter = 0;
        while (counter< names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }


    }
}
