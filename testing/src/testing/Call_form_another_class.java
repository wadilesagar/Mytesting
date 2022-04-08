package testing;

public class Call_form_another_class {
	

	public static void add()
	{
	 int a=10;  //static method
	 int b=20;
	 int sum=a+b;
	 System.out.println("addition is "+sum);
	}
	public void sub()
	{
		int a=30; //non static method
		int b=20;
		int sub=a-b;
		 System.out.println("substraction  is "+sub);
	}

}	
