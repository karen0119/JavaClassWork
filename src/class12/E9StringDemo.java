package class12;

public class E9StringDemo {
    public static void main(String[] args) {
        // how to search for words in a sentence

        String sentence= "I don't see SEARCH result";
        System.out.println(sentence.endsWith("result")); // prints true
        System.out.println(sentence.contains("see")); // prints true
    }
}
