package class20;

public class ParentOverride {  // parent class

              // override example
    void getMarry(){
        System.out.println("Marry to the girl of our choice");
    }
    private void accessBank(){  // can't override private method
        System.out.println("Accessing bank");
    }
    static void printNumber(){  // can't override static method but can be re-declared
        System.out.println(25);
    }
}
class Axel extends ParentOverride {  // child class
    @Override
    void getMarry(){
        System.out.println("I want to marry Karol and want 10 kids");
    }

}
class ParentOverrideTester{
    public static void main(String[] args) {
        Axel axel=new Axel();  //object for Axel child class
        axel.getMarry(); //I want to marry Karol and want 10 kids
        Axel.printNumber(); // 25
    }
}