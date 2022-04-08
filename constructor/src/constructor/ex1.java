package constructor;

public class ex1 {
	
  //ex for default constructor

	public static void main(String[] args) {

	ex1 c1=new ex1();//create object for non static method
	c1.test();
	
	test1();//for static method

	}
	public void test()
	{
		System.out.println("Hi this is non static method");
	}

	public static void test1()
	{
		System.out.println("Hi this is static method");
	}
}
