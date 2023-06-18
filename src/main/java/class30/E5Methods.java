package class30;

public class E5Methods {
    public static void main(String[] args) { // print methods:

        E5Methods e4Methods=new E5Methods(); // need to create an object of class first

        e4Methods.printWord("Hello Java",5); // to print method with whatever string
    }
    // create methods:
    void printWord(String word, int n){ //Loop method
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}
