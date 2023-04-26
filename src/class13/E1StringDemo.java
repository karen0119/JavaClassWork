package class13;

public class E1StringDemo {
    public static void main(String[] args) {
        // String method replace example
        String str = "Batch 16 is good";

        str = str.replace("good", "excellent");

        System.out.println(str);
        // prints: Batch 16 is excellent
        System.out.println(str.replace('e','E'));
        // prints: Batch 16 is ExcEllEnt
    }
}
