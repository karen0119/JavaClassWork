package class22;

public class FinalDemo {

    final String SSN;
    FinalDemo(String SSN){
        this.SSN=SSN;
    }

    void changeSSN(){
        //Not allowed as value will be assigned already in constructor
        // SSN="12-358";
    }

}
