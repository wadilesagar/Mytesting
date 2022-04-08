package practice_STATE;

public class P1 {
 int a1;
 int b1;
 int c1;
 
	public static void main(String[] args) {

     P1 p=new P1();
     p.addition();
     P1 p1=new P1(100);
     p1.addition();
     P1 p2=new P1(100,200);
     p2.addition();
     P1 p3=new P1(100,200,300);
     p3.addition();
}
	public P1()
	{
		a1=10;
		b1=20;
		c1=30;
		
	}
	public P1(int a)
	{
		a1=a;
	}
	public P1(int a,int b)
	{
		a1=a;
		b1=b;
	}
	public P1(int a,int b,int c)
	{
		a1=a;
		b1=b;
		c1=c;
		
	}
	public void addition()
	{
	int sum=a1+b1+c1;
	System.out.println("addition is "+sum);
	}
}