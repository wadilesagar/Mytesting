package methods;

public class sample2 {

	public static void test1()
	{
		System.out.println("this is a non static regular method tets1");
	}                       //call from same class
	
	public static void test2()
	{
		System.out.println("this is a non static regular method");
	}                          //call from same class
	
	public static void main(String[] args) 
	{
   sample2. test1();
   sample2. test2();
   System.out.println();
		
	}

}
