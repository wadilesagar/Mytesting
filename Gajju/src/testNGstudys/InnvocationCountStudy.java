package testNGstudys;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class InnvocationCountStudy {
  @Test(invocationCount = 1)
  public void facebook() 
  {
	  Reporter.log("facebook",true);
  }
  @Test (invocationCount = 2)
  public void instagram() 
  {
	  Reporter.log("facebook",true);
  }
  @Test(invocationCount = 3)
  public void twitter() 
  {
	  Reporter.log("facebook",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("beforeMethod",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("afterMethod",true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("beforeClass",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("afterClass",true);
  }

}
