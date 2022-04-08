package sample1;

public abstract class Demo {
int a=10;
	public static void main(String[] args) 
	{
	s1();
	s2();
	}
	public static void s1()
	{
		int a=20;
	System.out.println("this is complete method s1");	
	}
   public static void s2()
   {
	System.out.println("this is complete method s2");
   }
   public abstract void s3();
}
