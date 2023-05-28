package class5;

public class E6LogicalOperators {
    public static void main(String[] args) {
/* Logical Operator example --> OR(||), as long as 1 condition is true,
it will execute the code
 */

//example 1
        int age = 17;
        if (age < 18 || age > age) {
            System.out.println("You will get a discount");
        }

 //example 2
        char gender='F';
        String name="Mary";
        if (gender=='F' || age>60 ){
            System.out.println("You will get a discount");
        }

    }


}

