package failedXml;
import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class NewTest {
	  @Test
	  public void mymethod1() 
	  {
		  Reporter.log("mymethod1",true);
	  }
	  @Test(timeOut=100)
	  public void MyMethod2() throws InterruptedException 
	  {
		  Thread.sleep(20);
		 Reporter.log("mymethod2",true);
	  }
	  @Test 
	  public void myMethod3()
	  {   
		  Assert.fail();
		  Reporter.log("mymethod3",true);
	  }
}
