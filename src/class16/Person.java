package class16;

public class Person {

    String SNN="155433"; // <- default access
    private String password; // for private(sensitive) information only, which
    // can only be shared in this class

    private static double bankBalance=12000; //private static field/variable
    private void printPassword(){  // private method
        System.out.println(password);
        }
        private static void printBalance(){
            System.out.println(bankBalance); // will print
        }


    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPassword(); // will print the private info
        System.out.println(Person.bankBalance); // will print too
    }
}
