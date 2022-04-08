package Contro_State;

public class else_if3 {

	public static void main(String[] args) {
	float salary=9000f;
	if(salary>20000)
	{
		System.out.println("you are eligible for grade A");
	}
	else if(salary>=20000)
	{
		System.out.println("ypu are also eligible for grade A");
	}
	else if(salary>20000)
	{
		System.out.println("you are eligible for grade B");
	}
	else if(salary>=15000)
	{
		System.out.println("ypu are eligible for grade C");
	}
	else if(salary<10000)
	{
		System.out.println("you are eligible for minimum salary");
	}
	
	else
	{
		System.out.println("you are not eligible for grade Payment");
	}
	}

}
