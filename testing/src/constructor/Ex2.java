package constructor;

public class Ex2 {
	public Ex2(int a,int b,int c)
	{
	int mul=a*b*c;	
	System.out.println("mul is "+mul);
	}

	public static void main(String[] args) {
		Ex1 obj=new Ex1();
		Ex1 obj1=new Ex1(60);
		Ex1 obj2=new Ex1(70,80);
		
		Ex2 obj3=new Ex2(15, 25, 35);
	}

}
