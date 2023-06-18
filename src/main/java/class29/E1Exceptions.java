package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class E1Exceptions { // NOT recommended at all to "throws FileNotFoundException"

    public static void main(String[] args) throws FileNotFoundException {

        method1();
    }

    static void method1() throws FileNotFoundException {
        method2();
    }

    static void method2() throws FileNotFoundException {
        method3();
    }

    static void method3() throws FileNotFoundException {
        File file = new File("Files\\Employees.xlsx");
        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
        }
    }
    }

