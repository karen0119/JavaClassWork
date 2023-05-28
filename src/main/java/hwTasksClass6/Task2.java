package hwTasksClass6;

import java.util.Scanner;

public class Task2 {
    /* Task 2:
    Write a program that will ask user to input inputs
    the current time (use 24 hour format).
        Based on the given time define:
       if hour is between 1-11 --> Morning
       if hour between 12-15 --> Afternoon
       if hour between 16-20 --> Evening
       if hour between 21-24 --> Night
     */
    public static void main(String[] args) {
        Scanner time=new Scanner(System.in);
        System.out.println("Enter a time in a 24 hour format");
        int num=time.nextInt();

        if (num>=1 && num<=11) {
            System.out.println("Morning");
        } else if (num>=12 && num<=15 ) {
            System.out.println("Afternoon");

        } else if (num>=16 && num<=20){
            System.out.println("Evening");
        } else if (num>=21 && num<=24) {
            System.out.println("Night");
        }



    }
}
