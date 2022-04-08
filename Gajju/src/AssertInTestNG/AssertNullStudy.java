package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullStudy {
  @Test
  public void Test1()
  {
	String a="vctc";
	
	Assert.assertNull(a);
  }
  //if there is null value test will be pass otherwise failed
  
  @Test
  public void Test2()
  {
	String a=null;
	
	Assert.assertNull(a);
  }
  //if we  provide "" or " " result always will be negative or failed
}
