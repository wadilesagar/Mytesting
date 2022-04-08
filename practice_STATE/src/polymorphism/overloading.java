package polymorphism;

public class overloading {

	public static void main(String[] args) {
		
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void add(int a,int b,int c)
	{
		int sub=a-b-c;
		System.out.println(sub);
	}
	public void add(int a,int b,int c,int d)
	{
		int sum=(a+b)+(b+c);
		System.out.println(sum);
	}
	public void add(int a,int b,int c,int d,int e)
	{
		int sub=(a-b)-(a+b)-(a*c)-(a/b);
		System.out.println(sub);
	}

}
