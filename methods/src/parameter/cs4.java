package parameter;

public class cs4 {

	int a;
	int b;
	float value;
	String name;
	
	public cs4()
	{
	 a=30;
	 b=20;
	 value=20.22f;
	 name="SAGAR";
	System.out.println("substraction is "+value);
	System.out.println("-------------------------");
	}
	
	public cs4(int a,int b) {
	
	System.out.println("substraction is "+value);
	System.out.println("-------------------------");
	}
	public cs4(int a,int b,float sub) {
	
	System.out.println("value of float is "+sub);
	System.out.println("-------------------------");
	}
	public cs4(int a,int b,float sub,String name) {
	
    System.out.println("name of student is "+name);
    System.out.println("-------------------------");
    System.out.println("-------------------------");
    
	}
	
	public static void main(String[] args) {
		cs4 c1=new cs4(30,20);
		c1.sub();
		cs4 c2=new cs4(30,20,30.20f);
		c2.sub();
		cs4 c3=new cs4(30,20,30.20f,"SAGAR");
	    c2.sub();
	   
     }
	private void sub() {
		value =b-a;
		name ="SAGAR";
		
		
	}
}
