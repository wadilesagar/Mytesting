package dailyPractice;

public class Static_call_from_another_class {

	public static void main(String[] args) {
		Static_non_static n=new Static_non_static();
		n.add();
	}
	public static void sub()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("sub is "+c);
	}

}
