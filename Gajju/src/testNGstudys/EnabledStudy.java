package testNGstudys;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EnabledStudy {
  @Test
  public void MyMethod1() 
  {
	  Reporter.log("my method 2 ");
  }
  @Test(enabled = false)
  public void MyMethod2()
  {
	  Reporter.log("my method 2");
  }
  @Test
  public void MyMethod3()
  {
	  Reporter.log("my method 3");
  }
  @BeforeClass
  public void yourmethod1()
  {
	  Reporter.log("your method");
  }
  @AfterClass
  public void yourmethod2()
  {
	  Reporter.log("your method2",true);
  }
  @BeforeMethod
  public void yourmethod3()
  {
	  Reporter.log("your method 3",true);
  }
  @AfterMethod
  public void yourmethod4()
  {
	  Reporter.log("your method 4",true);
  }
  @BeforeSuite
  public void minemethod1()
  {
	  Reporter.log("mine method 1",true);
  }
  @AfterSuite
  public void minemethod2()
  {
	  Reporter.log("mine method 2",true);
  }
}
