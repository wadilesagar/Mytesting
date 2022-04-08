package testNGstudys;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class new_Test2 {

private static final String Enable = null;
//	@BeforeTest
//	public void test1()
//	{
//		System.out.println("test1");
//	}
	@Test (priority=1) public void test2()
	{
		System.out.println("test2");
	}
	@Test (priority=2) public void test3()
	{
		System.out.println("test3");
	}
	@Test (priority=3) public void test4()
	{
		System.out.println("test4");
	}
	@AfterTest public void test5()
	{
		System.out.println("test5" ,false);
	}

	
}
