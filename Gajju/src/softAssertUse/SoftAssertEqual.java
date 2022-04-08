package softAssertUse;

import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class SoftAssertEqual {
	
	SoftAssertEqual s=new SoftAssertEqual();
	
  @Test
  public void MyMethod() 
  {
	  String s="nandurbar";
	  String s1="Nandurbar";
	  
	  s.assertNotEquals(s, s1);
	  
  }
}
