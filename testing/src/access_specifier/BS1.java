package access_specifier;

public class BS1 {
int a=10;
public int b=20;
private int c=30;
protected int d=40;
public static void main(String[] args) 
      
     {
		BS1 d=new BS1();
		d.b1();
		d.b2();
		d.b3();
		d.b4();
      }

public void b1()	{System.out.println("public b1 is for BS1");}
void b2()           {System.out.println("default b2 ");}
protected void b3() {System.out.println("protected b3");}
private void b4()   {System.out.println("private b4");}

}
