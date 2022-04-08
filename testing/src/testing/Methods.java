package testing;

public class Methods {
	
	public static void add()
	{
	 int a=10;
	 int b=20;
	 int sum=a+b;
	 System.out.println("addition is "+sum);
	}
	public void sub()
	{
		int a=30;
		int b=20;
		int sub=a-b;
		 System.out.println("substraction  is "+sub);
	}
	   public static void main(String[] args) {
		add();
		Methods o=new Methods();//object 
		o.sub(); //calling
		
		Call_form_another_class.add(); //from another class
		
		Call_form_another_class ob=new Call_form_another_class();
		ob.sub();
		
	}

}
