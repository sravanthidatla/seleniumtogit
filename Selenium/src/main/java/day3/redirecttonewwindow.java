package day3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redirecttonewwindow {
	public static void main(String[] args) throws InterruptedException
	{
		
		
		String chromePath=("C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe");
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//a[contain(text(),'Click Here')]")).click();
		
		String MainWindow=driver.getWindowHandle();
		 	System.out.println("Main Window unique no"+MainWindow);
		 	Set<String> s1=driver.getWindowHandles();
		 	for(String string: s1) {
		 		String ChildWindow=string;
		 		
		 		System.out.println("child window unique no"+ChildWindow);
		 		
		 		driver.switchTo().window(ChildWindow);
		 		
		 	}
		 	driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
		 	driver.findElement(By.name("btnLogin")).click();
		 	
		 	driver.switchTo().window(MainWindow);
		
		
		

}
}