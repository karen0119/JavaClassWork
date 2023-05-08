package class17;

public class DogTester {
    public static void main(String[] args) {

        //objects to call constructor method
        DogConstructor dog1=new DogConstructor("Jack","black","persian",12);
        DogConstructor dog2=new DogConstructor("Shaggy","white","husky",8);
        DogConstructor dog3=new DogConstructor("Fluffy","pink","british",7);
        DogConstructor dog4=new DogConstructor("Papi","brown","asian",6);
        DogConstructor dog5=new DogConstructor("Marley","red","golden",10);
        // to print information
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();

    }
}
