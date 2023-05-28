package class6;

public class E4SwitchStatement {
    public static void main(String[] args) {
// similar to the else-if statements
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // without the break the value will keep going
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day number");
        }


    }
}
