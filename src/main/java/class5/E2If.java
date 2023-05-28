package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
//Below code helps us get any type of data from the console
        Scanner input = new Scanner(System.in);
        System.out.println("Is it time for break true/false");
        boolean isBreak = input.nextBoolean();
        if (isBreak) {
            System.out.println("Let's have a break"); //this wont print
        } else {
            System.out.println("Lets continue the class"); //this will print
        }

    }
}
