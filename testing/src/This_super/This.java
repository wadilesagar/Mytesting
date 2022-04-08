package This_super;



public class This extends s1

{
	
	int a=44; //golbal
    int b=20;
	int c=30;
	int d=40;
	public static void main(String[] args) {
	This d=new This();
		d.Math();
		
	}
	public void Math()
	{
		int a=70;
		int b=80;
		int sum=a+b;
		int sum1=a+b;
		int sum3=22;
		System.out.println("addition"+sum);
	    System.out.println(sum1=a+this.a);
	    System.out.println(sum3=a+super.a);
	}

}
