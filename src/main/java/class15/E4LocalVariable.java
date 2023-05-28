package class15;

public class E4LocalVariable {

    // Local variables are the most efficient to use
    String name="Jimi"; // instance

    void print(){
        int number=10;
        System.out.println(number);
    }

    public static void main(String[] args) {
        int number=10;

        E4LocalVariable e4=new E4LocalVariable();
        e4.print();

        if(true){
            int sum; // local variable must be initialized, before we can reuse them
            //System.out.println(sum); <-- won't print
        }


        switch ("java"){
            case "a":
                int sum=0; //local variable used and initialized (0)
        }

        for (int i = 0; i < 10; i++) {
            int sum=0; // same local variable reused and initialized (0)
            for (int j = 0; j <5 ; j++) {

                System.out.println(sum);
            }

        }

    }
}
