package hwTasksClass6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Task 4:
        3. Write a program that will read three inputs
        of scores (quiz, mid-term, and final scores) and
        determine the grade based on the following rules:
            if the average score >=90 → grade=A
            if the average score >= 70 and <90 → grade=B
            if the average score>=50 and <70 → grade=C
            if the average score<50 → grade=F
         */

        int score = 90;

        if (score >= 90) {
            System.out.println("grade=A");
        } else if (score >= 70 && score < 90) {
            System.out.println("grade=B");
        } else if (score >= 50 && score < 70) {
            System.out.println("grade=C");
        } else if (score < 50) {
            System.out.println("grade=F");
        }
    }
}
