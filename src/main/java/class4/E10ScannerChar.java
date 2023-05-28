package class4;

import java.util.Scanner;

public class E10ScannerChar {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender=scanner.next().charAt(0); //always have a 0 to only show first letter of word
        System.out.println("you entered "+gender);

    }
}
