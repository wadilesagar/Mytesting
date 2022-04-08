package dailyPractice;

import constructor.A1;

public class A1 {

	public static void main(String[] args) {
		A1 a=new A1();
		a.A1();
		a.A1('S', 'B', 20);
		a.A1("sagar", 40, 20.30f, "nandurbar");
	}
	public void A1()
	{
		String name="sagar";
		int roll_no=1234;
	    Float per =89.30f;
	    
	    String city=" NANDURBAR";
	    System.out.println(""+name +roll_no +per +city);
	}
public void A1(String a,int b,Float per,String city)
{
System.out.println("parameterized method");
	}
public void A1(char a,char b,int c)
{
	System.out.println("parameterised method");
	}
	}

}
