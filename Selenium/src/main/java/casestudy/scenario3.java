package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario3 {

	public static void main(String[] args) {
		
		String chromePath="C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",chromePath);
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	    driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	    driver.findElement(By.name("userName")).sendKeys("sravanthi");
	    driver.findElement(By.xpath("//span[contains(text(),'New')]")).click();
	     String ret=driver.findElement(By.tagName("h3")).getText();
	     if(ret.equals("Available"))
	     {
	  
	    
	    driver.findElement(By.name("firstName")).sendKeys("sai");
	    driver.findElement(By.name("lastName")).sendKeys("datla");
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.findElement(By.name("confirmPassword")).sendKeys("123456");
	    driver.findElement(By.xpath("//input[@value='Female']")).click();
	    driver.findElement(By.name("emailAddress")).sendKeys("sra@gmnail.com");
	    driver.findElement(By.name("mobileNumber")).sendKeys("6573657326");
	    driver.findElement(By.name("dob")).sendKeys("11/11/1997");
	    driver.findElement(By.name("address")).sendKeys("visakhapatnam");
	    driver.findElement(By.name("securityQuestion")).click();
	    driver.findElement(By.name("answer")).sendKeys("vizag");
	    driver.findElement(By.xpath("//input[@value='Register']")).click();
	    
	     }
	    
	    
	    //}
		// TODO Auto-generated method stub

	}

}
