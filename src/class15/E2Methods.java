package class15;

public class E2Methods {
    /* Task1
     Create a method call it method1 print.
     In the body it should print "hello world". */
    void method1 (){

        System.out.println("hello world");
        }

    /* Task2
    Create a method that takes an array as input. It adds all the numbers from
    the array and returns the sum. Name of the method should be sumArr
    Ex:
        sumArr{10,10,10} --> 30

     return type --> int
     method name --> sumArr
     parameters (same as INPUT) --> array
     body --> sum variable and for loop and return command
     */
    // method
    int sumArr (int [] arr){
        int sum=0; // need variable to hold the sum
             for (int i=0; i< arr.length; i++) {
                 sum=sum+arr[i];
             }
             return sum;
        }
    // object
    public static void main(String[] args) {
        E2Methods e2=new E2Methods();
        int sum = e2.sumArr(new int[]{10,10,10});
        System.out.println(sum); // prints 30
       }
    }

