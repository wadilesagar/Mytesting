package parameter;

public class Methods {
	public static void addition() {
	 int a=10; // declaration nd initialize
	 int b=20;
	 int sum=a+b;
	System.out.println("addition for a+b "+sum);
	}
	
	public void addition(int a,int b)
	{
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	

	 System.out.println("--------------");
	 System.out.println("multiplication is a*b "+mul);
	 System.out.println("--------------");
	 System.out.println("substraction is a-b "+sub);
	 System.out.println("--------------");
   System.out.println("addition is a+b "+sum);
  	}
	
	
	public static void main(String[] args)
	{
	Methods e=new Methods();
	addition();
	e.addition(10,50);
	e.addition(30, 40);
	e.addition(70, 30);
	
	}


}
