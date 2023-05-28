package class12;

public class E8StringDemo {
    public static void main(String[] args) {
        // helps search data between strings

        String sentence = "    JAVA is very very easy";
        // method chaining and it's possible in String class
        sentence = sentence.trim().toLowerCase(); // to fix spaces and upper cases
        System.out.println(sentence);


        System.out.println(sentence.startsWith("java")); // prints true
        System.out.println(sentence.startsWith("Python")); // prints false
        System.out.println(sentence.startsWith("Java")); // prints false

    }
}
