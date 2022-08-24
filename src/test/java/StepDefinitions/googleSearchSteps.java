package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public  class googleSearchSteps{

	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver" , "/Users/nasibausmanova/Downloads/drivers/chromedriver");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com/");}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation Step by step");
	}

	@And("click button enter")
	public void click_button_enter() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to serach result")
	public void user_is_navigated_to_serach_result() {
		 driver.getPageSource().contains("Online Courses");
		   driver.close();
		   driver.quit();
	}

}