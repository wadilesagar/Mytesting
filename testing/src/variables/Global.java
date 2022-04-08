package variables;

public class Global {

	int a=10;
	int b=30;
	float c=10.20f;
	float d=20.30f;
	int sum=a+b;
	int sub=b-a;
	int mul=a*b;
	float div=c/d;
	public static void main(String[] args) 
	{
	Global obj4=new Global ();	
	System.out.println("addition is "+obj4.sum);	
	System.out.println("addition is "+obj4.sub);
	System.out.println("addition is "+obj4.mul);
	System.out.println("addition is "+obj4.div);

	}

}
