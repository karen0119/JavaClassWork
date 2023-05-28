package class13;

public class E8StringDemo {
    public static void main(String[] args) {

        // StringBuilder is fast but can take more computer memory

        StringBuilder str = new StringBuilder("1");
        for (int i = 0; i < 100; i++) {
            str.append(i);
        }
    }
}
