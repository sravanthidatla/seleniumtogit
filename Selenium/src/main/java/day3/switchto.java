package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switchto {
	public static void main(String[] args)
	{
		
		String chromePath=("C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe");
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		//driver.get("webdriver.chrome.driver",chromePath);
		
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.titleContains("Demo Guru99 Page"));
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aaa5e");
		driver.findElement(By.xpath("http//body/a/img")).click();
	}
}
