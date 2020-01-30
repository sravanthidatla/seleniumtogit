package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivermethods {

	public static void main(String[] args) {
		
		String ChromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars/ChromeDriver.exe";
		System.setProperty("webdriver.chrome.driver",ChromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium.dev/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.NANOSECONDS);
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Downloads")).click();
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("http://google.com");
		driver.navigate().refresh();
		String text=driver.getTitle();
		System.out.println(text);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getPageSource());
		// TODO Auto-generated method stub

	}

}
