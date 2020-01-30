package skeleton;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchitem {
	
	WebDriver driver;
	@Given("The URL of Testmeapp {string}")
	public void the_URL_of_Testmeapp(String url)
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();   
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("user enters {string} as user_Name")
	public void user_enters_as_user_Name(String username)
	{
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("user enters {string} as Pass_word")
	public void user_enters_as_Pass_word(String password) 
	{
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("user clicks on {string} BuTTon")
	public void user_clicks_on_BuTTon(String string)
	{
		 driver.findElement(By.name("Login")).click();
	}

	
	

	@When("user searches for the product")
	public void user_searches_for_the_product() 
	{
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("head");
	}

	@When("user clicks on the product")
	public void user_clicks_on_the_product() 
	{
	    driver.findElement(By.xpath("//form//input[@name='val'] ")).click();
	}

	@Then("user clicks on addtocart")
	public void user_clicks_on_addtocart() 
	{
	 driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();  
	}

}
