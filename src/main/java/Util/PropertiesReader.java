package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;
 

public class PropertiesReader{
	
	public static Properties pr ;
	public static FileInputStream fis;
	
	
	public static void userLogin () throws IOException {
	pr= new Properties();
    fis = new FileInputStream("/Users/nasibausmanova/eclipse-workspace/Cucumber-BDD/src/test/resources/cucumber.properties");
	
	pr.load(fis);
	
	}

	
}