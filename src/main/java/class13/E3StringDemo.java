package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        // Replace all string method examples
         String str="kahjvfdajDDF    HGF%&15161^3*(**";

        System.out.println(str.replaceAll("[a-z]",""));
        // removes all lower case letters, prints: DDFHGF%&151613*(**
        System.out.println(str.replaceAll("[^a-z]",""));
        // removes special characters and upper case letters, prints: kahjvfdaj
        System.out.println(str.replaceAll("[^a-z]","\\$"));
        // to print special characters
        System.out.println(str.replaceAll(" ","\\$"));
        // to replace spaces

    }
}
