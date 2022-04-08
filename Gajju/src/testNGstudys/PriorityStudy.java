package testNGstudys;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class PriorityStudy {
  @Test(priority = 1)
  public void facebook() 
  {
	  Reporter.log("facebook",true);
  }
  @Test(priority = 1)
  public void instagram() 
  {
	  Reporter.log("instagram",true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("BM",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("AM",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("BC",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("AC",true);
  }

}
