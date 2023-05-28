package class13;

public class Task4 {
    public static void main(String[] args) {
        /*
        You have a string a = "Is it saturday? Is it raining?
        Do we have a java class today?"
        How would you find out how many sentences are in that string?
         */

        String str = "Is it saturday? Is it raining? Do we have a java class today?";

        String[] strArr = str.split("[.!?]");
        System.out.println(strArr.length);
        // prints 3
    }
}