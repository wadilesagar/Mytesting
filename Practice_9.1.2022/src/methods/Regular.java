package methods;

public class Regular {

	public static void  add()
	{
    int a=10;
	int b=20;
	int c=a+b;
	 System.out.println("addition is "+c);	
	  
	}
	public  void sub()
	{
		 int h=30;
		 int e=20;
		 int d=h-e;
		 System.out.println("addition is "+d);	
	}
	public void div()
	{
		float  s=30;
		float  r=20;
		float div=s/r;
		 System.out.println("division is "+div);	
	}
	public static void main(String[] args) {
		
		add();
		Regular s=new Regular();
		s.sub();
		s.div();
		
		Regu1 t=new Regu1();
		t.raj();

	}

}
