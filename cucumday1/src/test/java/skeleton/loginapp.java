package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginapp {
	
	WebDriver driver;
	
	@Given("The URL of testmeapp is {string}")
	public void the_URL_of_testmeapp_is(String url) 
	{
	  System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	}

	@When("user enters {string} as userName")
	public void user_enters_as_userName(String username) 
	{
	  driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("user enters {string} as Password")
	public void user_enters_as_Password(String password) 
	{
		 driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("user clicks on {string} Button")
	public void user_clicks_on_Button(String Button) 
	{
      driver.findElement(By.name("Login")).click();
	}



}
