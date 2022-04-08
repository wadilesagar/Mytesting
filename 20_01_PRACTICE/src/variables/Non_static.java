package variables;

public class Non_static {
int a=30;
int b=40;
int c=a+b;
int d=c+a;
	public static void main(String[] args) {
    Non_static d=new Non_static();//created object
		d.add();//local variable call  
	   System.out.println("c is "+d.c);//global variable call
	   System.out.println("a is "+d.d);
	}
public void add()
{
	int d=44;
	int e=55;
	int h=d+e;
	System.out.println("h is "+h);
	}

}
