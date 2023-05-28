package class26;

import utils.ConfigReader;

import java.io.IOException;

public class E3ConfigReader { //same as E5ConfigFiles

    // this method is a shortcut method from ConfigReader
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("userName"));
        System.out.println(ConfigReader.getProperty("password"));
        System.out.println(ConfigReader.getProperty("URL"));

    }
}
