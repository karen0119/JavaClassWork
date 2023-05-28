package hwTasksClass6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Task 1:
        Write a program that will print whether it is a weekend or
        weekday. If any day from 1-5 → output “It is a weekday”,
        any day from 6-7 → output “It is a weekend”,any other day →
        output “Invalid day”.

        Ask user to enter a number and then
        define if number is small, medium or large
        Small number is value between 1 and 10
        Medium number is value between 11 and 100
        Large number is value between 101 and 1000
         */
        //1
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number 1-7");
        int day=scan.nextInt();

        if (day>=1 && day<=5) {
            System.out.println("It is a weekday");
        } else if (day==6 || day==7 ) {
            System.out.println("It is a weekend");

        } else {
            System.out.println("Invalid Day");
        }
        System.out.println();

        //2
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter  a number 1-1,000");
        int num=scan1.nextInt();

        if (num>=1 && num<=10) {
            System.out.println("Small Number");

        } else if (num>=11 && num<=100 ) {
            System.out.println("Medium Number");

        } else if (num>=101 && num<=1_000 ){
            System.out.println("Large Number");
        }



    }
}
