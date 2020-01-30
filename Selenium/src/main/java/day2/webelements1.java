package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webelements1 {
	
	public static void main(String[] args)
	{
		String iePath= "C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars/ChromeDriver.exe";
		System.setProperty("webdriver.chrome.driver",iePath);
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement Uname=driver.findElement(By.name("userName"));
		Uname.sendKeys("mercury");
		Uname.clear();
		
		WebElement Pwd=driver.findElement(By.name("password"));
		Pwd.sendKeys("mercury");
		
		
		WebElement Signin=driver.findElement(By.name("login"));
		Signin.click();
		
		WebElement home=driver.findElement(By.linkText("Home"));
		String text=home.getText();
		System.out.println(text);
		home.click();
		
		
		
		
				
				
				
		
	}

}
