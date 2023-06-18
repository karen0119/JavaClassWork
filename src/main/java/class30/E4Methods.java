package class30;

public class E4Methods {
    public static void main(String[] args) { // print methods:

        E4Methods e4Methods=new E4Methods(); // need to create an object of class first
       // e4Methods.printHello(); // call the instance method
        e4Methods.printWord("Hello Java"); // to print method with whatever string
    }
    // create methods:
    void printHello(){ // instance method
        System.out.println("Hello World");
    }
    void printWord(String word){ //parameter method
        System.out.println(word);
        printHello(); // you can also call the instance method like this
    }
}
