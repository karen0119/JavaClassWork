package class13;

public class MethodPrinter {
    void printSomething(){
    // Method 1) ---> defining methods
        // static method and won't change

        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
    }

    // Method 2) ---> defining methods
    // This method you can write how many to print and what to print
    // Can only pass 1 value at a time (what word to print)
    static void printWord(String word){
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }

    // Method 3) ---> defining methods
    // This method you can control how many to print and what to print
    // Can pass two values at a time (what word to print and how many times)
    static void printWordManyTimes(String word, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }

    }
}
