package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertweb 
{
	
	public String baseurl= "http://newtours.demoaut.com/";
	String chromePath=("C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\jars\\ChromeDriver.exe");
	
	public WebDriver driver;
	
	@Test(priority=1)
	public void verifyHomePageTitle1() 
	{
		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver=new ChromeDriver();
		driver.get(baseurl);
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}
		@Test(priority=1)
		public void verifyHomePageTitle11()
{
			System.out.println("Launching chrome browser");
			System.setProperty("webdriver.chrome.driver",chromePath);
			driver=new ChromeDriver();
			driver.get(baseurl);
			String expectedTitle="Welcome: Mercury Tours";
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.close();
		}
			@Test(priority=2)
			public void verifyHomePageTitle16()
			{
				System.out.println("Launching chrome browser");
				System.setProperty("webdriver.chrome.driver",chromePath);
				driver=new ChromeDriver();
				driver.get(baseurl);
				driver.findElement(By.partialLinkText("SIGN-ON")).click();

				String expectedTitle="Sign-on: Mercury Tours";
				String actualTitle=driver.getTitle();
				Assert.assertEquals(actualTitle, expectedTitle);
				driver.close();
			}
				@Test(priority=3)
				public void verifyHomePageTitle2() 
				{
					System.out.println("Launching chrome browser");
					System.setProperty("webdriver.chrome.driver",chromePath);
					driver=new ChromeDriver();
					driver.get(baseurl);
					driver.findElement(By.partialLinkText("REGISTER")).click();

					String expectedTitle="Register: Mercury Tours";
					String actualTitle=driver.getTitle();
					Assert.assertEquals(actualTitle, expectedTitle);
					driver.close();
				}
					@Test(priority=4)
					public void verifyHomePageTitle3() 
					{
						System.out.println("Launching chrome browser");
						System.setProperty("webdriver.chrome.driver",chromePath);
						driver=new ChromeDriver();
						driver.get(baseurl);
						driver.findElement(By.partialLinkText("CONTACT")).click();

						String expectedTitle="Under Construction: Mercury Tours";
						String actualTitle=driver.getTitle();
						Assert.assertEquals(actualTitle, expectedTitle);
						driver.close();
					}
						@Test(priority=5)
						public void verifyHomePageTitle4() 
						{
							System.out.println("Launching chrome browser");
							System.setProperty("webdriver.chrome.driver",chromePath);
							driver=new ChromeDriver();
							driver.get(baseurl);
							driver.findElement(By.partialLinkText("SUPPORT")).click();
							String expectedTitle="Under Construction: Mercury Tours";
							
							String actualTitle=driver.getTitle();
							Assert.assertEquals(actualTitle, expectedTitle);
							driver.close();
						}

}
