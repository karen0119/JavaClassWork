package hwTasksClass6;

import java.util.Scanner;

public class Task3 {
    /* Task 3:
    Write a program for user to enter his/hers birth month.
    Based on the month define the season.
    Example: if user is born in March, April, May → season =”Spring”
    if user is born in June, July, August → season =”Summer”  etc …
    At the end of the program we should see 1 output
    as “You were born is season __”.
     */
    public static void main(String[] args) {

        Scanner month = new Scanner(System.in);
        System.out.println("Enter the month you were born in");
        String season = month.next();

        if (season.equals("March") || season.equals("April") || season.equals("May")) {
            System.out.println("You were born in season spring");

        } else if (season.equals("June") || season.equals("July") || season.equals("August")) {
            System.out.println("You were born in season summer");

        } else if (season.equals("September") || season.equals("October") || season.equals("November")) {
            System.out.println("You were born in season fall");
        }
            if (season.equals("December") || season.equals("January") || season.equals("February")) {
                System.out.println("You were born in season winter");

            }

        }
    }







