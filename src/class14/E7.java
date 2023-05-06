package class14;

public class E7 {
    /*
    Create a method that will take 2 parameters as a number
    and prints which number is larger
     */
    void printLarger(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        //System.out.println(Math.max(a, b));
    }

    public static void main(String[] args) {
        E7 e7 = new E7();
        e7.printLarger(40, 30);
    }
}
