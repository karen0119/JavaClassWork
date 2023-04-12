package class4;


import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        /*Scanner is a class which knows how to take input from the keyboard
           scan is a variable of type scanner just like we create a variable of type String
           new => is a special keyword which create the object of a class
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");

        String name=scan.next();
        System.out.println("You are amazing "+name);

    }
}
