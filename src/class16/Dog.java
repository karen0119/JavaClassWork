package class16;

public class Dog {
    // instance variables:
    String name;
    String color;
    String breed;

    static int age;

    // methods:
    void bark(){
        System.out.println(name+" is barking");
    }
    void printInfo() {
       if (breed.equals("German")) {
           System.out.println(name+" "+color+" i work in NYPD");
       } else {
           System.out.println(name+" can be used as a pet");
       }

    }
    static void printInfo2(){
        if(age<10){
            System.out.println("Young dog");
        }else {
            System.out.println("Old dog");
        }
    }

    public static void main(String[] args) {
        printInfo2();
    }

}
