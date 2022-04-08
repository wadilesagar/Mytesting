package constructor;

public class Ex3 {
	
int a=10;
int b=20;
int sum=a+b;
public Ex3(int a,int b)
{
System.out.println("addition is "+sum);

}
public Ex3(int a)
{
System.out.println("addition is "+sum);

}


	public static void main(String[] args) {
		Ex3 ob=new Ex3(30, 50);
		Ex3 ob1=new Ex3(50);
	
	}

}
