package Constructor;

public class CS2 {
	
	public CS2()
	{
		System.out.println("this is zero parameter method"); 
	}
	
	public static void  add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("'addition is "+c);
	}
	 
	public static void main(String[] args)
	{
		CS2 s=new CS2();
		s.add();
		s.test1();
	}
	 
	public void test1()
	 {
		 System.out.println("this is non static method");
	 }

}
