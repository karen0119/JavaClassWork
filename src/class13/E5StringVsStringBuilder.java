package class13;

public class E5StringVsStringBuilder {
    public static void main(String[] args) {

// Stronger builder is another way of building a string

        StringBuilder str = new StringBuilder("Java");
        System.out.println(str.reverse());
        // reverses letters, prints: avaJ

        String str1="Computer"; // regular string
        StringBuilder str2=new StringBuilder(str1); // change regular string to StringBuilder

        // prints computer

        str2.reverse();
        str1=str2.toString();
        System.out.println(str1);
        //reverse letters, prints: retupmoC


    }

}
