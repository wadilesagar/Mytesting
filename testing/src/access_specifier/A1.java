package access_specifier;

public class A1 {
int a=10;
public int b=20;
protected int c=30;
private int d=40;
	public static void main(String[] args) {
		A1 a=new A1();
		a.test1();
		a.test2();
		a.test3();
		a.test4();
	
	}
	public void test1()
	{System.out.println("public void test1");}
     void test2()
    {System.out.println("default access specifier");}
    private void test3()
    {System.out.println("private acces sepcifier");}
    protected void test4()
    {System.out.println("protectes Access Specifier");}
}
