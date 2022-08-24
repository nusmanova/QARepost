package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginKaplanPage {

	
	WebDriver driver;
	
	@FindBy (css= "input#email")
	WebElement email;
	
	@FindBy (xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement logbutton;
	
	
	public LoginKaplanPage (WebDriver d){
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void entermail(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterpws(String pass) {
		password.sendKeys(pass);
	}
	
	public void logclick() {
		logbutton.click();
	}
	
	
}
