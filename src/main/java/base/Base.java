package base;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import Util.PropertiesReader;


public class Base extends PropertiesReader {
	
	protected  static WebDriver driver;
	public static String BaseUrl;
	
	public static WebDriver setup () throws IOException {
		
		PropertiesReader.userLogin();
		
		String browser =pr.getProperty("browser");
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/nasibausmanova/Downloads/drivers/chromedriver");
			driver= new ChromeDriver();
		}
		
		else if (browser.equals("safari")) {
		System.setProperty("webdriver.safari.driver", "/Users/nasibausmanova/Downloads/drivers/chromedriver");
		driver= new SafariDriver();
	    }
		
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 BaseUrl= pr.getProperty("url");
		
		 return driver;
	
}
}