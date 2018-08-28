package com.dummytest.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UrlGetter {

    public String abc() {
        File file = new File("\\IdeaProjects\\MyTest\\src\\test\\java\\com\\dummytest\\Data.properties");
        Properties prop = new Properties();
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //load properties file
        try {
            prop.load(fileInput);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        String Fromfileurl = prop.getProperty("AAAUrl");
//        System.out.println("This is the URL:" + Fromfileurl);
        return prop.getProperty("AAAUrl");
    }

}