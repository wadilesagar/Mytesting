package testNGstudys;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DependsOnMethods {
  @Test(dependsOnMethods = {"instagram2"})
  public void facebook1() 
  {
	  Reporter.log("facebook",true);
  }
  @Test
  public void instagram2() 
  {
	  Reporter.log("facebook",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("facebook",true);
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

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("beforeSuite",true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("afterSuite",true);
  }

}
