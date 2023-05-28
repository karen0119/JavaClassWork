package class13;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a string that should be combination of letters, numbers,
        and special characters. Find out how many Alphabet (a-z or A-Z)
        characters are there in the string.
         */

        String str = "dksfksndSHBDHs3442@";

        System.out.println(str.replaceAll("^a-zA-z", "").length());
        // prints 19






    }
}
