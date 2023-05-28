package class12;

public class E5StringDemo {
    public static void main(String[] args) {
// empty vs blank
        String name="       ";
        System.out.println(name.isEmpty()); // doesn't include spaces to check
        System.out.println(name.isBlank()); // it checks everything including spaces
    }
}
