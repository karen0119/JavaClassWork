package class18;

// Write a program to inherit class D that has method  println which is static
// and can reuse that method into class E
public class D {
    static void print(){
        System.out.println("Hello World");
    }
}

class E extends D{

}

class ETester{
    public static void main(String[] args) {
        E.print(); // prints: Hello World
    }
}
