package class13;

public class E4StringDemo {
    public static void main(String[] args) {
        // String method split example

        String str = "Today is Sunday. we have java class. we like java";

        String[] strArr = str.split("[.!?]"); // to look for sentences

        System.out.println(strArr.length);
        // prints: 3 b/c of split sentences after the period
        System.out.println(strArr[0]);
        // prints: Today is Sunday
        System.out.println(strArr[2].trim());
        // to remove space in front of period
    }
}
