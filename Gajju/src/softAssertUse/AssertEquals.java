package softAssertUse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEquals {
	SoftAssert s = new SoftAssert();
	 @Test
	  public void MyMethod1() {
		  String a="gopal";
		  String a1="gopal";
		  byte c=10;
		  byte d=20;
		 // assertEquals(false, false);
		  s.assertEquals(a, a1,"tc is not matching");
		  s.assertNotEquals(a, d);
		  s.assertAll();
	  }
	 
		  @Test
		  public void MyMethod2() {
			  String b="gopal";
			  String b1="gop";
			 // assertEquals(false, false);
			  s.assertEquals(b, b1,"tc is not matching");
			  s.assertAll();
		  }
}
