package class14;

public class E4ArrayUtils {
      /*
    create a method to add two int numbers, and it should return the results
    back when called name of the method should be add
     */
    /*
    return type=> int
    name of the method=> add
    parameters=> (int a,int b)
    body of the method => {
    int sum=a+b;
    return sum;
    }
     */
    // Method
    int add(int a, int b) {
        int sum = a + b;
        return sum;

    }
    // Object class
    public static void main(String[] args) {
          /*
        we are calling the "add" method on "obj" object passing two arugments one
        is 10 other is 20 and storing the results from method call into the
        sum variable
         */
        E4ArrayUtils obj = new E4ArrayUtils();
        int sum = obj.add(10, 20);
        System.out.println(sum);
    }

}
