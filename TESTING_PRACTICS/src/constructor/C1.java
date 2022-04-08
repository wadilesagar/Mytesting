package constructor;

public class C1 
    {
int s1=10;
int s2=20;
int s3=40;
int d1=50;
int d2=60;
int d3=70;
	public static void main(String[] args) 
	{
       C1 c=new C1();
       
       C1 c1=new C1(10);
       C1 c2=new C1(10,20);
       
	}
  public C1()
   {
	int a=10;int b=20;int c=a+b;
    System.out.println("non parametrised method "+c);
   }
  public C1(int a)
  {
	  int d=a;
	System.out.println("One para method "+d);
	}
  public C1(int a,int b)
  {
int c=a+b;
		System.out.println("One para method "+c);
  }
  public void C1(int a,int b,int c)
  {
int p=a*b*c;
		System.out.println("One para method "+p);
  }
 
}
