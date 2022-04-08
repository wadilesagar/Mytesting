package INTERFACE;

public class implementClass implements MYINTERFACE{

	public static void main(String[] args) {
		System.out.println(a);
		implementClass i=new implementClass();
		i.m1();
		i.m2();
		i.m3();
	}


	public void m1() {
		System.out.println("method of my interface");
	}

	public void m2() {
		System.out.println("method of my interface");
	}
	 void m3()
	 {
		 System.out.println("methods of implements class");
	 }//own method of implemeantation class

}
