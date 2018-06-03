package cn.utility;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

/**
 * Created by hoducust on 2018/6/3 18H 44m .
 */
public class LoadCountext {

    public Properties countext;

    private InputStream propertiesLoader(){
        InputStream stream = ClassLoader.getSystemResourceAsStream("../jdbc.properties");
        return stream;
    }



}
