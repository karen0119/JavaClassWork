package class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Task: Prompt the user to enter person heights in inches.
        Person should be classified as one of the following:
        - short (under 60 inches)
        - medium (between 60-72 inches)
        - tall (over 72 inches
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your height");
        int height = scan.nextInt();

        if (height < 60) {
            System.out.println("Short");
        } else if (height >= 60 && height <= 72) {
            System.out.println("Medium");

        } else {
            System.out.println("Tall");

        }

    }
}
