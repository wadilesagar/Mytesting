package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void Test1() 
  {
	  boolean result=true;
	  
	  Assert.assertTrue(result);
  }
  @Test
  public void Test2() 
  {
	  boolean result=false;
	  
	  Assert.assertTrue(result);
	
  }
}
