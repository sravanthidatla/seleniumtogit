package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class testmeappscn1 {

	public static void main(String[] args) {
		
		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("mercury.tours.com");
		
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
	    driver.findElement(By.name("Login")).click();
		
		
		Assert.assertEquals(driver.getTitle(),"Home");
		
		
		driver.findElement(By.name("Sign Out")).click();
		driver.close();
		
		
		
	}
	
}
