package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class extractlinks {
	
	public static void main(String[] args)
	{
		
		String chromePath=("C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe");
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4");
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Welcome: Mercury Tours"));
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links:- "+linkList.size());
		
		for(WebElement link: linkList) {
			System.out.println(link.getText()+":-"+ link.getAttribute("href"));
		}
		
		
	}

}
