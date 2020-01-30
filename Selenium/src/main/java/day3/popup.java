package day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	
	public static void main(String[] args)
	{
		
		
		String chromePath=("C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe");
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("webpage");
		driver.findElement(By.name("password")).sendKeys("webpage123");
		driver.findElement(By.name("btnLogin")).submit();
		
		Alert alert=driver.switchTo().alert();
		
		String alertMessage=driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		alert.accept();
		
		
			
	
		
		
		
	}

}
