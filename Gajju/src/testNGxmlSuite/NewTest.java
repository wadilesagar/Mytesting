package testNGxmlSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void mymethod1() 
  {
	  Reporter.log("mymethod1",true);
  }
  @Test
  public void MyMethod2() 
  {
	 Reporter.log("mymethod2",true);
  }
  @Test 
  public void myMethod3()
  {
	  Reporter.log("mymethod3",true);
  }
}
