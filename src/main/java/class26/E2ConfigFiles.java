package class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigFiles { //same as E4ConfigFiles
    public static void main(String[] args) throws IOException {

            //System.getProperty("user.dir") -> gives the path to your project
            System.out.println(System.getProperty("user.dir"));

            // this gives the path to the project and config.properties
            String path=System.getProperty("user.dir")+"\\"+"Files\\Config.properties";
            System.out.println(path);

            // this class will navigate to the file config.properties
             FileInputStream fileInputStream=new FileInputStream(path);
             // that special class which knows how this file works
             Properties properties=new Properties();
             properties.load(fileInputStream);
             System.out.println(properties.getProperty("userName")); // prints Admin

    }
}
