package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class webpage2{
	  @Test(dataProvider = "dp")
	  public void DataInfo(String user,String pwd,String confpwd) {
		// TODO Auto-generated method stub
String chromePath=("C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe");
System.setProperty("webdriver.chrome.driver",chromePath);
WebDriver driver=new ChromeDriver();
driver.get("http://www.demoaut.com/");
driver.findElement(By.partialLinkText("REGISTER")).click();
 


driver.findElement(By.name("email")).sendKeys(user);

driver.findElement(By.name("password")).sendKeys(pwd);

driver.findElement(By.name("confirmPassword")).sendKeys(confpwd);


driver.close();
}
@DataProvider
public Object[][] dp() {
	return new Object[][] {
		new Object[] {"bmc","bmc123","bmc123"},
		new Object[] {"cmd","cmd123","cmd123"},
		new Object[] {"rajkumar","raj123","raj123"},
		
	};
}
}