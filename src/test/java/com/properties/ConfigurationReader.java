package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
public ConfigurationReader() throws Throwable {
	File f=new File("C:\\Users\\HP\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\properties\\Adactin.properties");
	FileInputStream fis=new FileInputStream(f);
	p=new Properties();
	p.load(fis);
}
public String getBrowser() {
	String browser = p.getProperty("browser");
	return browser;
}
public String geturl() {
	String url = p.getProperty("url");
	return url;

}
}
