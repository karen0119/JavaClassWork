package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
Get the location of the file
Either navigate to that file or bring that file into the memory
 */
public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

       // System.getProperty("user.dir"); --> it gives you the path to your project
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties"; //to get full location/path of file
        //Brings the data from the file in the form of bytes
        FileInputStream fis=new FileInputStream(path); // a variable to store the path data
        //Converts the data in the form of key value pairs
        Properties prop=new Properties();  // object of class
        prop.load(fis); // this will load the path data stored in fis

        System.out.println(prop.getProperty("userName")); // to get the value of the userName key
        System.out.println(prop.containsKey("userName")); // will return true or false based if the key is present in that file
    }
}
