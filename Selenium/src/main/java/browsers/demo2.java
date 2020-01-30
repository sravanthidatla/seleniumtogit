package browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class demo2 {
	
	public void main(String[] args)
	{
		String chromePath="";
		System.setProperty("webdriver.chrome.driver",chromePath);
		
		WebDriver driver= new ChromeDriver();
		driver.get("hfhgjkdhrgj");
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getTitle(), "Login");
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		System.out.println("no of links"+linkList.size());
		
		for (WebElement link :linkList) {
			System.out.println(link.getText()+link.getAttribute("href"));
			
			
		}
		
		
		
	}

}
