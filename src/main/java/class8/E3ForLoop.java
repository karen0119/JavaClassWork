package class8;

public class E3ForLoop {
    public static void main(String[] args) {
        // write a loop to add the even numbers from 1 to 10

        int sum = 0; // creating a variable to hold the sum.. 0 because nothing will happen to the sum
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // checking if a number is EVEN
                sum = sum + i; // same as sum+=i // adding all the even number to the sum variable one by one
            }
        }
        System.out.println(sum);
    }
}
