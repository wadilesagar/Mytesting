package constructor;

public class B1 {

	public static void main(String[] args) {

B1 b=new B1();
b.B1();
B1 b2=new B1();

b2.B1("sagar", 1234, 50000, 9168841477l);



	}
	public void B1()
	{
		String b="sagar";
		int rollno=123;
		float sal=500000f;
		String add="Nandurbar";
		long mono=9168841477l;
		System.out.print(" "+b+" "+rollno+" "+sal+" "+add+" "+mono);
	}
	public void B1(String s,int rollno ,float f,long mono )
	{
		System.out.print(" "+s+ " "+rollno+ ""+f+""+mono);	}

}
