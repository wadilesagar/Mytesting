package this_super;

public class super2 extends superkeyword
{
int a=300;
	public static void main(String[] args) {
		super2 s=new super2();
		s.dis2();
	}
   public void dis2()
   {
	  int c=a+b;
	   int a=30;
	   System.out.println("local value of a"+a);
	   System.out.println("global value of a"+this.a);
	   System.out.println("variable call from another class "+super.c1);
	   
   }
}
