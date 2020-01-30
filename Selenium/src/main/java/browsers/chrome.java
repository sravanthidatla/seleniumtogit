package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String chromePath=("C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe");
System.setProperty("webdriver.chrome.driver",chromePath);
WebDriver driver=new ChromeDriver();
driver.get("http://www.demoaut.com/");
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("Sravanthi");
driver.findElement(By.name("lastName")).sendKeys("datla");
driver.findElement(By.name("phone")).sendKeys("9887463");
driver.findElement(By.name("userName")).sendKeys("sra@gmail.com");
driver.findElement(By.name("address1")).sendKeys("kundalahalli");
driver.findElement(By.name("city")).sendKeys("bangalore");
driver.findElement(By.name("email")).sendKeys("sra@gmail.com");
driver.findElement(By.name("password")).sendKeys("4352");
driver.findElement(By.name("confirmPassword")).sendKeys("4325");
driver.findElement(By.name("register")).click();
			
	}

}
