package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class pagenotfound {
	WebDriver driver;
	
	
	@Given("testme app {string}")
	public void testme_app(String url) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize(); 
	}

	@When("search headphone")
	public void search_headphone() {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("head");
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
	    
	}

	@When("proceed to payment without adding to cart")
	public void proceed_to_payment_without_adding_to_cart() {
	   driver.findElement(By.xpath("//form[2]//input[1]")).click();
	   Assert.assertFalse(driver.findElement(By.xpath("//form[2]//input[1]")).isDisplayed());
	}

	@Then("testmeapp doesnot display cart icon")
	public void testmeapp_doesnot_display_cart_icon() {
	    driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
	    Assert.assertFalse(driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).isDisplayed());
	}



}
