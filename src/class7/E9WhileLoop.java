package class7;

public class E9WhileLoop {
    public static void main(String[] args) {
// print 25 20 10 5 using a while loop hint using if condition

        int counter = 25;

        while (counter >= 5) {
            if (counter != 15) { // use this so it doesn't print 15
                System.out.print(counter + " ");

            }
            counter -= 5;
            // needs to be out of this curly bracket or it won't work


        }

    }
}
