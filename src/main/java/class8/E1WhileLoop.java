package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        // print all numbers from a starting point to an ending point
        //Ask the user for starting and ending and a step to skip by a number

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a starting and ending number and a step");

        int start = scan.nextInt();
        int end = scan.nextInt();
        int step = scan.nextInt();

        int counter = start; // this is the starting point that user enters

        while (counter <= end) {
            System.out.print(counter + " ");

            counter = counter + step; // instead of ending with ++;
        }

    }
}
