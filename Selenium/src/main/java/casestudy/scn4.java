package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scn4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",chromePath);
WebDriver driver=new ChromeDriver();

driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
driver.findElement(By.name("userName")).sendKeys("sravanthi");
driver.findElement(By.name("password")).sendKeys("123456");
driver.findElement(By.name("Login")).click();
Assert.assertEquals(driver.getTitle(),"Home");

	}

}
