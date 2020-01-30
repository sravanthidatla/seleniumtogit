package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion1 {
  @Test
  public class softAssert{
	  
	  public void softassertEx()
	  {
		  SoftAssert sa=new SoftAssert();
		  
		  System.out.println("***test case two started****");
		  sa.assertEquals("hello","Hello","first soft assert failed");
		  
		  
		 System.out.println("hard assert success.......");
		 
		 sa.assertTrue("hello".equals("hello"),"second soft assert failed");
		 sa.assertTrue("Welcome".equals("welcome"),"Third soft assert failed");
		 
		 System.out.println("****test case two executed successfully****");
		 
		 
		 sa.assertAll();
		 
	  }
  }
}
