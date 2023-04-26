package class13;

public class Task1 {
    /*
    Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print
        For example String str=hello => l
     */
    public static void main(String[] args) {

        //  String str=new String("Java"); syntax approach 1

        String str = "hello";  // most used syntax approach
        // l prints because hello has odd (5) characters

        if (!str.isBlank() && str.length() % 2 != 0 && str.length() >= 3) {
            int middleIndex = str.length() / 2;
            char middleChar = str.charAt(middleIndex);
            System.out.println(middleChar);
        }
    }
}
