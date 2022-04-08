package this_super;

public class this1 {
    int a=90;
    int b=40;
    static int z=1;
	public static void main(String[] args) {
	this1 t=new this1();
	t.display();
	t.dis1();
	}
	public void display()
	{
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a);//calling local variable
		System.out.println(this.a);//caling gloal variable
		System.out.println(b);//calling local variable b
		System.out.println(this.b);
		System.out.println(this.z);//caaling static global variable by using this keyword
	
	}
	public void dis1()
	{
		System.out.println(this.a+b);
	}

}
