package class28;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        try {
            // System.out.println(10/0);
           // int[] arr = new int[-5];
            "".charAt(10);
        }
        catch(ArithmeticException e) {
            System.out.println("Someone is diving by zero");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Someone is trying to create an array of negative size");
        }
        catch (Exception e){
            System.out.println("Something has gone wrong execute backup code");
        }
        System.out.println("4");
    }
}
