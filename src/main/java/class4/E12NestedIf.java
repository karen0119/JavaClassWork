package class4;

public class E12NestedIf {
    public static void main(String[] args) {

        // both 'if's MUST be true or same in order for the statement to print

        System.out.println("1 or text");

        if (true){
            System.out.println("1 or text"); //this one will print
            if(false){
                System.out.println("2 or text"); //this one will NOT print
            }
        }

        System.out.println("4"); //this one is independent so it will print
    }
}
