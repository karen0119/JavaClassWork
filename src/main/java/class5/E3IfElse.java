package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
//Step one
        Scanner scanner=new Scanner(System.in);
 //Step two
        System.out.println("Please enter your age");

        int age=scanner.nextInt();
        if (age<18){
            System.out.println("You can't drive");
        } else {
            System.out.println("You can drive");
        }

    }
}
