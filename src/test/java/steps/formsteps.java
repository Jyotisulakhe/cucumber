package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formsteps {

	WebDriver driver;
	
	@Given("User Open form the website")
	public void user_open_form_the_website() {
	    
		 driver=new ChromeDriver();
		 driver.get("https://v1.training-support.net/selenium/simple-form");
		 driver.manage().window().maximize();
	
	}

	@When("User should enter first name, last name, email, contact number, messgae")
	public void user_should_enter_first_name_last_name_email_contact_number_messgae() {
		driver.findElement(By.id("firstName")).sendKeys("Jyoti");
		driver.findElement(By.id("lastName")).sendKeys("Sulakhe");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("number")).sendKeys("1234567892");
		
	   
	}

	@When("User Click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	    
	}

	@Then("Thank you alert should be dissplayed")
	public void thank_you_alert_should_be_dissplayed() {
		driver.switchTo().alert().accept();
		driver.close();
	   
	}
}
