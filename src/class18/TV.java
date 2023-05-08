package class18;

public class TV {    // parent class
    int size;
    String make;
    String model;
}

class AppleTV extends TV{     // child class

}

class TVTester {
    public static void main(String[] args) {
        AppleTV appleTV=new AppleTV();
      //  System.out.println(appleTV.make);  <- prints null for empty
    }
}
