package class14;

public class E1Methods {
    void printWord (String word){

        System.out.println(word);
    }
     /*     Syntax meaning:
     void --> return type of the method void means, it's an empty data type
     printWord --> it's the name of the method
     (String word) --> parameters/input
     {System.out.println(word);} --> body of the method you can write
         if conditions, loops, ect
      */

    public static void main(String[] args) {
        // we are creating an object of the E1Methods class
        // in java all classes are treated as data types
        //new E1Methods(); --> creating the object of the E1Methods class
        E1Methods obj=new E1Methods();
        // we are calling the printWord() method an obj and passing "Java"
        // as an argument or put
        obj.printWord("Java");
    }
}
