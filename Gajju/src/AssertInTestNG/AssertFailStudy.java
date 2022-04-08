package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFailStudy {
  @Test
  public void Test1() 
  {
	  String s="pune";
	  String s1="pune";
	  
	  Assert.assertNotNull(s, "s is  null");
	  System.out.println( "s is  null");
	  Assert.assertNull(s1,"s1 is not null");
	  System.out.println("s1 is not null");
      Assert.fail();
}
} 