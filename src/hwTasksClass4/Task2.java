package hwTasksClass4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
/* 2) You are a loan specialist and you need to ask user
what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client.*/

        Scanner scanner=new Scanner (System.in);
        System.out.println("What is the amount of loan");
        int money= scanner.nextInt();

        if (money<=200_000){
            System.out.println("Lend money");
        } else {
            System.out.println("Loan rejected");
        }


    }
}
