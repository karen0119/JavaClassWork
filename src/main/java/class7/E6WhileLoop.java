package class7;

public class E6WhileLoop {
    public static void main(String[] args) {
// print these numbers 2, 6, 8, 10, 12, 14 using a while loop
        int counter=2;

        while (counter<15){
            System.out.println(counter);

            counter+=2; // Read as even=even+2.This will increase by 2 each time
        }
    }
}
