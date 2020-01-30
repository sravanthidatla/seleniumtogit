package testngdemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	
  @Test(priority=1)
  public void validate_Sign_on()
  {
	  System.out.println("Validating sign_on");
  }
  
  @Test(priority=2)
  public void validate_Regidter()
  {
	  System.out.println("Validating Register");
	  
  }
  
  @Test(priority=3)
  public void validate_Support()
  {
	  System.out.println("Validating Support");
  }
  
  @Test(priority=4)
  public void validate_Contact()
  {
	  System.out.println("Validating Contact");
  }
  
  @BeforeClass
  public void open_browser()
  {
	  System.out.println("*****Opening Browser*****");
  }
  
  @AfterClass
  public void close_browser()
  {
	  System.out.println("****Closing Browser*****");
  }
  
  @BeforeMethod
  public void Home_Page()
  {
	  System.out.println("<<....Opening Home Page.... >>");
  }
  @AfterMethod
  public void Sign_Out()
  {
	  System.out.println("<<....Signing Out....>>");
  }
  
}
