package data_TYPES;

public class NON_STATIC1 
    {

	public static void main(String[] args) 
	{
   NON_STATIC1 n=new NON_STATIC1();
   n.add();
   NON_STATIC2 n1=new NON_STATIC2();
   n1.division();
		   
	}
   public void add()
   {
	   int a=10;int b=30;int c=a+b;
	   System.out.println("ADDITION IS "+c);
   }
}
