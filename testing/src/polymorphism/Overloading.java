package polymorphism;

public class Overloading {

	public static void main(String[] args) {
	Overloading d=new Overloading();
    d.sub();
	d.sub(12, 13);
	d.sub(44,33 );
	}
public void sub()
{   int a=20;
	int b=30;
	int sub=a+b;
	System.out.println("sub is "+sub);}
public void sub(int a,int b)
{
	int sub =a+b;
	System.out.println("sub is "+sub);
}
public void sub(double a,double b)
{
	double per =a+b;System.out.println("sub is "+per);}
}
