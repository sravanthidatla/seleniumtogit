package testngdemos;

import org.testng.annotations.Test;

public class StaticDataProvider {
	
  @Test(dataProvider="getData",dataProviderClass=DataProviderSource.class)
  public void client1Test(Integer p,String p1) {
	  String pl = null;
	System.out.println("Client1 testing: Data("+p+","+"String is"+"-"+pl+")");
  }
  
  @Test(dataProvider="getData1",dataProviderClass=DataProviderSource.class)
  public void client2Test(Integer x,String y) {
	  System.out.println("Client2 testing:Data("+x+","+"String is"+"-"+y+")");
  }
 
  }

