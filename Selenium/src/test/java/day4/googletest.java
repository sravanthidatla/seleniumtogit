package day4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class googletest {
  @Test
  public void f(){
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("google home");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("register new user");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("name");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("phone");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("address");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("click on finish");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("successful registration");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("click on finish");
  }
  

}
