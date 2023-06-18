package class30;

public class E10Methods {
    /*
    create a method that will take an array of ints and will return the sum
    of the elements of the array method should be accessible throughout the projects
    and method should be callable by just writing the name of the class
     */
        public static int sumArr(int[] arr) {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        }
    }

