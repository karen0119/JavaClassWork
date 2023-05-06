package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
      //  person.password="kshsaj"; <- will not print b/c of private
      //  person.printPassword(); <- will not print b/c of private
      //  Person.printBalance(); <- will not print b/c of private
        System.out.println(person.SNN); //<- Prints b/c its default access
    }
}
