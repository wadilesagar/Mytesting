package method;

public class ex1 {

	
	public static void addition()//without parameter
	{
		int a=10;
		int b=20;
	 int sum=a+b;
	 System.out.println("Addition is"+sum);
	}
	
	public static void main(String[] args)
	{
		addition();
		addition1(100,200,300);
		ex1 s=new ex1();
		s.studentInfo();
	

	
		
		

	}
	public static void addition1 (int a,int b,int c)//with parameter
	{
		int sum=a+b+c;
		
		System.out.println("addition "+sum);
	}
	public void studentInfo(){
		String name="sagar";
		int RollLNum=10;
		char grade='S';
		float marks=88.90f;
		
		System.out.println("                               ");
		System.out.println("studem=nt name is"+ name);
		System.out.println("student roll no is" + RollLNum);
		System.out.println(" student name start with" + grade);
		System.out.println("student marks is" + marks);
	}
	public void studentInfo1(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("addition is"+sum);
	}
}
