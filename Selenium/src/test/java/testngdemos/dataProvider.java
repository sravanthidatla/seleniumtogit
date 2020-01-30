package testngdemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
  @Test(dataProvider = "dp")
  
  public void DataInfo(Integer age,String name) {
	  System.out.println("age is"+" "+age);
	  System.out.println("name is"+" "+name);
	  
  }
  @DataProvider
  public Object[][] dp(){
	  return new Object[][] {
		  new Object[] {25,"Ram"},
		  new Object[] {30,"raj"},
		  new Object[] {31,"roy"},
	  
	  };
	  
  }
  
}
