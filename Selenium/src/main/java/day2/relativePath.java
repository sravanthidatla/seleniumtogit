package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativePath {
	
	public static void main(String[] args)
	{
		
		String iePath= "C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars/ChromeDriver.exe";
		System.setProperty("webdriver.chrome.driver",iePath);
		WebDriver driver= new ChromeDriver();
		

		driver.get("http://newtours.demoaut.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		//relative xpath
		driver.findElement(By.xpath("//td[2]/input")).sendKeys("mercury");
		driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("mercury");
		driver.findElement(By.xpath("//div/input")).click();
		
		
		driver.findElement(By.xpath("//a[contains (@href,'mercurywelcome.php')]")).click();
	}

}
