package variables;

public class Static {
	static int a=55;
	static int b=22;
	static int addi=a+b;
	
	public static void main(String[] args) {
	add();	
    System.out.println("addi is "+addi);
  //we declare global + local variable in static class
    //but can't declare non static variable in static cass or static method
	}
public static void add()
{
	int a=20;
	int b=40;
	int sum=a+b;
	System.out.println("sum is "+sum);
	}
}
