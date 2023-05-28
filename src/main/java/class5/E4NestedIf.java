package class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {

        int money = 15_000;
        String day = "Sunday";

            if (money > 10_000) {
                if (day.equals("Sunday")) {
                    System.out.println("Lets go shopping"); //this will print b/c its true "Sunday"
                } else {
                    System.out.println("Lets wait for Sunday");
                }
            } else{
                System.out.println("Lets save more");

            }

        }


    }

