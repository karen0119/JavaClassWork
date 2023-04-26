package class12;

public class E2StringDemo {
    public static void main(String[] args) {

        // Write a code to check the username and password if the userName and
        // password are less than 8 characters this msg "Signup successful"
        // Otherwise print "Username and password can't be more than 8 character"

        String userName = "admin";
        String password = "pass123";

        if (userName.length() > 8 && password.length() > 8) {
            System.out.println("Username and password can't be more than 8 character");
        } else {
            System.out.println("Signup successfully");
        }

    }
}
