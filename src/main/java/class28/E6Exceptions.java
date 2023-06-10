package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) {
        // if path is correct the execution will be empty
        // if path is incorrect then it will send a message

        try{
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\karen\\IdeaProjects\\SDETJavaBatch16\\Files\\Employees.");
        }
        catch(FileNotFoundException foundException){
            System.out.println("Hey the file you are wanting to open is not found");
        }
    }
}
