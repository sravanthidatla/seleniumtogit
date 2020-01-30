package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouse {

	public static void main(String[] args) throws InterruptedException{
		
		
		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='/electronics']"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='/camera-photo']"))).click().build().perform();
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
