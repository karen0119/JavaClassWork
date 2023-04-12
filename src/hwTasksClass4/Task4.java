package hwTasksClass4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* 4)Create a Java program that will ask user to input city
        and temperature.Your program should convert Fahrenheit into
         celsius and print “The temperature is the city __ is __”*/

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your current city");
        String city=scan.next();
        System.out.println("What is the temperature in Fahrenheit");
        int tempF= scan.nextInt();

        int tempC=((tempF-32)*5/9);
        System.out.println("The temperature in the city of "+city+" is "+tempC+"C");







    }
}
