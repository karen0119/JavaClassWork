package class21;

public class Refresher {

    // Print all numbers in array
    public static void main(String[] args) {
        int [] arr={10,20,30};
        for(int num: arr){  // use ENHANCED LOOP to go through the array
            System.out.println(num); // 10, 20, 30
        }

        String [] names={"Vlad","Karen","Moraya"};
        for (String name: names){    //use ENHANCED LOOP to go through the array
            System.out.println(name.length());  // 4, 5, 6
        }

        Dog dog1=new Dog ("Lal","Black","Persian");
        Dog[] dogs={dog1, new Dog("Papi","White","chinese")};

        for(Dog dog: dogs){  //use ENHANCED LOOP to go through the array
            dog.printInfo();
        }
    }
}
