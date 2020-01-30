package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registrationapp {
	
	
	WebDriver driver;
	
	@Given("The URL of TestMeApp {string}")
	public void the_URL_of_TestMeApp(String url)
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
	}

	@When("User enters {string} as user_name")
	public void user_enters_as_user_name(String username) 
	{
		driver.findElement(By.name("userName")).sendKeys("Sravanthi");
	}

	@When("User enters {string} as firstname")
	public void user_enters_as_firstname(String firstname) 
	{
		driver.findElement(By.name("firstName")).sendKeys("Sai");
	}

	@When("user enters {string} as lastname")
	public void user_enters_as_lastname(String lastname) 
	{
		driver.findElement(By.name("lastName")).sendKeys("datla");
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String password)
	{
		driver.findElement(By.name("password")).sendKeys("123456");
	}

	@When("user enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String confirmpassword) 
	{
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
	}

	@When("user selects {string} as gender")
	public void user_selects_as_gender(String gender) {
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
	}

	@When("user enters {string} as email")
	public void user_enters_as_email(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys("Sra@gmail.com");
	}

	@When("user enters {string} as mobilenumber")
	public void user_enters_as_mobilenumber(String mobilenumber) {
		driver.findElement(By.name("confirmPassword")).sendKeys("1234565756");
	}

	@When("user enters {string} as DOB")
	public void user_enters_as_DOB(String DOB) {
		driver.findElement(By.name("dob")).sendKeys("11/11/1997");
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String address) {
		driver.findElement(By.name("address")).sendKeys("vizag");
	}

	@When("user selects {string} as SecurityQuestion")
	public void user_selects_as_SecurityQuestion(String SecurityQuestion) {
		driver.findElement(By.xpath("//select[@id='securityQuestion']")).click();
	}

	@When("user enters {string} as answer")
	public void user_enters_as_answer(String answer) {
		driver.findElement(By.name("answer")).sendKeys("vizag");
	}

	@Then("user clicks on {string} button")
	public void user_clicks_on_button(String button) {
		driver.findElement(By.name("Submit")).click();
	}




}
