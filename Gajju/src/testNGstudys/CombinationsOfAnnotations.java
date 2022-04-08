package testNGstudys;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CombinationsOfAnnotations {
  //Enabled use===========================
  @Test(enabled = false)
  public void login() 
  {
	  Reporter.log("login",true);
  }
  //InvocationCount use=================
  @Test(invocationCount = 2)
  public void login1() 
  {
	  Reporter.log("login",true);
  }
  //Priority use=================
  @Test(priority = 2)
  public void login2() 
  {
	  Reporter.log("login",true);
  }
  //Priority use=================
  @Test(timeOut = 1000)
  public void login3() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("login",true);
  }
  @BeforeMethod
  public void username() 
  {
	  Reporter.log("username",true);
  }

  @AfterMethod
  public void logout() 
  {
	  Reporter.log("logout",true);
  }

  @BeforeClass
  public void launchbrowser() 
  {
	  Reporter.log("launchbrowser",true);
  }

  @AfterClass
  public void CloseBrowser() 
  {
	  Reporter.log("CloseBrowser",true);
  }

  @BeforeSuite
  public void FacebookUse() 
  {
	  Reporter.log("FacebookUse",true);
  }

  @AfterSuite
  public void Facebookused() 
  {
	  Reporter.log("FacebookUsed",true);
  
  }

}
