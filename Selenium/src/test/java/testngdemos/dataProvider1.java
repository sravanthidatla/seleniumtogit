package testngdemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataProvider1 {
  @Test(dataProvider = "dp")
  public void DataInfo(Integer age,String name) {
	  System.out.println("age is"+" "+age);
	  System.out.println("name is"+" "+name);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
