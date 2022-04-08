package practice_STATE;

public class P2 {
int a;
int b;
int c;

	public static void main(String[] args) {
		P2 p=new P2(10,20,30);
		p.addition();
		p.addition();
		p.addition();
		p.addition();
		
		P2 p1=new P2(20,10,30);
		p1.substraction();
		p1.substraction();
		p1.substraction();
		p1.substraction();
		
		P2 p2=new P2(30,40,50);
		p2.multiplication();
		p2.multiplication();
		p2.multiplication();
		p2.multiplication();
		
		P2 p3=new P2(20,50,60);
		p3.division();
		p3.division();
		p3.division();
		p3.division();
	}
public P2()
{
int a=10;	
}
 public P2(int a)
{
	 int num=a;
}
 public P2(int a,int b)
 {
	 int num=a;
	 int num1 =b;
 }
 public P2(int a,int b,int c)
 {
	 int num=a;
	 int num1=b;
	 int num2=c;
	 
 }
 public void addition()
 {
	 int sum=a+b+c;
	 System.out.println("addition is "+sum);
 }
 public void substraction()
 {
	 int sub=a-b-c;
	 System.out.println("Substraction is "+sub);
 }
 public void multiplication() 
 {
	 int mul=a*b*c;
	 System.out.println("Multiplication is "+mul);
 }
 public void division ()
 {
	 int div=a/b;
	 int div1=b/c;
	 System.out.println("Division is "+div);

	 System.out.println("Division is "+div1);
 }
}
