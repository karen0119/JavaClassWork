package class6;

public class E1LogicalOperators {
    public static void main(String[] args) {

        boolean chocolate = false;
        boolean flowers = true;
        if (chocolate || flowers) {
            System.out.println("I am happy");
        } else {
            System.out.println("I am sad");
        }
        boolean fiveG = true;
        boolean wifi = false;

        if (wifi || fiveG) {
            System.out.println("You can browse the internet");
        } else{
            System.out.println("Not connected to the internet");
        }
    }
}
// this will still print because at least 1 condition is true