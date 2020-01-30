package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class scn5 {

	public static void main(String[] args) {
		
		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		
		driver.findElements(By.xpath("//a[contains(text(),'SignIn')]"));
		driver.findElement(By.name("userName")).sendKeys("sravanthi");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals(driver.getTitle(),"Home");
		
		Actions action=new Actions(driver);
		WebElement search=driver.findElement(By.id("myInput"));
		action.keyDown(search,Keys.SHIFT).perform();
		action.sendKeys("b").pause(1000).sendKeys("a").pause(1000).sendKeys("g").perform();
		
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
		driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//center[1]//a[1]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Cart')] ")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
		driver.findElement(By.xpath("//form[2]//input[1]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[contains(text(),'Icici Bank')]")).click();
		driver.findElement(By.xpath("//a[@id='btn']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sravanthi");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//div[3]//input[1]")).click();
		
		driver.close();

	}

}
