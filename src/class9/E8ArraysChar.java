package class9;

public class E8ArraysChar {
    /*
    print all the numbers from 6 to 0 in reverse order and chars in reverse too
    {'A', 'B', 'C', 'D', 'E', 'F'}
    6 5 4 3 2 1 0
     */
    public static void main(String[] args) {

        char [] chars={'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.println(i+" "+chars[i]);

        }
// number 6 will not print but all everything else will since we only have 5 chars

    }
}
