package class17;

public class CatConstructor {

    //instance variable needed for constructor methods
    String name;
    int age;
    double weight;
    String color;


    //constructor methods
    CatConstructor(String catName){
        name=catName;
        System.out.println("1 argument constructor called");
    }
    CatConstructor (String name, String Color){
        System.out.println("2 argument constructors called");
    }

    CatConstructor (int age){
        age=age;
        System.out.println("Int argument constructor");
    }

    CatConstructor(double weight){
        System.out.println("double argument constructor");
    }

    CatConstructor(){
        System.out.println("0 argument constructor called");
    }

    void printInfo(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        CatConstructor cat=new CatConstructor(10);
        cat.printInfo();
    }
}
