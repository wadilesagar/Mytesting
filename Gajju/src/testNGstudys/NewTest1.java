package testNGstudys;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=1)
  public void facebook() 
  {
	  System.out.println("facebook.com");
	  Reporter.log("facebook.com");
  }
  
  @Test(priority=2)
  public void flipcart()
  {
	  System.out.println("flipkart .com");
	
  }
  @Test(priority=3)
  public void amazon()
  {
	  System.out.println("amazon.com");
  }
  @Test(priority=4)
  public void lenscart()
  {
	  System.out.println("lenscart.com");
  }
}
