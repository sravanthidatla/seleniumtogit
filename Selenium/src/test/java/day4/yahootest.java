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

public class yahootest {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Home page");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("enter username");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("enter login");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("click on Register");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("enter details");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("1234");
  }

  @BeforeSuite
  public void beforeSuite(){
	  System.out.println("click on next");
  }

  @AfterSuite
  public void afterSuite(){
	  System.out.println("finish registration");
	  
  }

}
