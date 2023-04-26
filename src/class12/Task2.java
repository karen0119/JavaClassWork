package class12;

public class Task2 {
    public static void main(String[] args) {
        // Print all the indexes wherever the letter 'a' is appearing
        String name="Today is Saturday";

        for (int i=0; i<name.length(); i++){
            if (name.charAt(i)=='a'){
                System.out.println(i+" "); // 3 10 15
               // System.out.println(name.charAt(i)); -> prints letters


            }
        }
    }
}
