package class18;

public class E1MultipleConstructor {
    public static void main(String[] args) {

        String str=new String("Java");
         char [] chars={'J','a','v','a'};

        // extract the word java and convert it to upper case

        String str1=new String(chars);
        char [] chars2={'t','h','e','J','a','v','a'};

        String str3=new String(chars2,3,4); // starts at index 3 and takes next 4 characters
        System.out.println(str3.toUpperCase()); // prints JAVA

    }

    static void method2(String name, int age){

    }
}
