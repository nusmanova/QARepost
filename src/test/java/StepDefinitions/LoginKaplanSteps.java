package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import Pages.LoginKaplanPage;
import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginKaplanSteps extends Base {
	LoginKaplanPage lip;
	WebDriver driver;
	
	@Before
	public void setUP() throws IOException {
	driver = Base.setup();
	driver.get(BaseUrl);
	}
	
	@Given("user is on CodeKaplan login page")
	public void user_is_on_code_kaplan_login_page()  {
	driver.navigate().to("https://codekaplan.com/login");
	} 
		

	@When("^user enters (.*) and (.*)$")
	public void user_enters_nasiba_usmanova_yahoo_com_and_plainfield2022(String username, String password) {
	    lip =new LoginKaplanPage (driver);
		lip.entermail(username);
		lip.enterpws(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		lip.logclick();
	}

	@Then("user succsessfully login and see information")
	public void user_succsessfully_login_and_see_information() {
	    System.out.println("User able to login succsessfully");     
	}
	
	@After
	public void tearDrown() {
		driver.close();
		driver.quit();
	}
}
