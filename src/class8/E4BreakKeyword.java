package class8;

public class E4BreakKeyword {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 50; i++) {
            if (i > 5) {
                break; //without the break, the code wont stop and is used to terminate it prematurely
            }
            System.out.println(i);
        }


    }


}



