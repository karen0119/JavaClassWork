package class12;

public class E11StringDemo {
    public static void main(String[] args) {

        // Search which index the letter is present in

        String name="Today is Saturday";
        System.out.println(name.indexOf('i')); // 6 will print
        // start searching from index 4
        System.out.println(name.indexOf('a', 4)); // how to search when
                                                        // there's same multiple letters
    }
}
