package hwTasksClass4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* 1)Create a Java program and declare int variable
        that will hold a month.
        Based on the value of the variable
       your program should print the name of the month. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of month");

        int month = scan.nextInt();

        if (month == 1) {
            System.out.println("January");

        } else if (month == 2) {
            System.out.println("February");

        } else if (month == 3) {
            System.out.println("March");

        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");

        } else if (month == 6) {
            System.out.println("June");
        } else {
            System.out.println("month is not here");
        }

    }
}
