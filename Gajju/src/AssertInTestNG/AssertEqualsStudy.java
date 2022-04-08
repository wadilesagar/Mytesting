package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class AssertEqualsStudy {
  @Test
  public void Test1() 
  {
	 String s="sag";
	 String s1="sag";
	 
	 Assert.assertEquals(s,s1, "Assert is not matching");
  }
  //if equals then pass otherwise failed
  @Test
  public void Test2()
  {
	  String s1="SAGAR";
      String s2="SAGAR1";
      
      Assert.assertNotEquals(s1,s2,"Assert is matching");
  }
  //if not equals pass otherwise failed
}
