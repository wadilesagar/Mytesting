package dailyPractice;

public class Constructor {

	public static void main(String[] args) {
		Constructor n=new Constructor();
	n.Constructor(10, 30);;
    n.Constructor(10.3f, 30.5f, 60.6f);
	}
	public  Constructor() {
		
        int a=20;//default comstructor
		int b=40;
		int c=a+b;
	System.out.println("add is "+c);
	}
	public void Constructor(int a,int b)
	{
	System.out.println("two prameterised method");	
	}
	public void Constructor(float a,float b,float c)
	{
		System.out.println("three parametrised method");
	}

}
