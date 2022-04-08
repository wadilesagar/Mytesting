package dailyPractice;

public class Static_non_static {
static int d=10;
static int h=60;
static int g=d+h;
	public static void main(String[] args) {
		add();
		System.out.println("add is global static "+g);
		Static_call_from_another_class n=new Static_call_from_another_class();
		n.sub();


	}
public static void add()
{
	int a=40;
	int b=50;
	int c=a+b;
	System.out.println("add is local static"+c);
}

}
