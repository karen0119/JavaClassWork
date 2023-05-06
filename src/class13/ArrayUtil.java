package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        // write the logic to search if the number is present in the array or not

        int[] arr = {10, 20, 45, 89};
        int[] arr1 = {12, 32, 455, 889};
        int[] arr2 = {120, 302, 5, 889};

        int number = 89;
        int number1 = 12;
        int number2 = 10;

        ArrayUtil obj=new ArrayUtil();
        obj.searchArray(arr,number);
        obj.searchArray(arr1,number1);
        obj.searchArray(arr2,number2);

        } // Create a method first to look for the array and number
        void searchArray(int []arr, int number){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number){
                    System.out.println("Yes");
                      break;
                    }
                }
            }
        }
            // Prints Yes 2 times

