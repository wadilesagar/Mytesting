package data_TYPES;

public class METHODS 
     {

	public static void main(String[] args) 
	{
	add();sub();mul();div();
	STATIC_METHOD.add();
	}
   public static void add()
   {
	   int a=10;int b=20;int c=a+b;
	   System.out.println("ADDITION IS "+c);
   }
   public static void sub()
   {
	   int a=20;int b=30;int c=a+b;
   System.out.println("SUBSTRACTION IS "+c);
   }
   public static void mul()
   {
	   int a=10;int b=30;int c=a*b;
	   System.out.println("MULTIPLICATION IS "+c);
   }
   public static void div()
   {
	   int a=40;int b=80;int c=a+b;
	   System.out.println("DIVISION IS "+c);
   }
}
