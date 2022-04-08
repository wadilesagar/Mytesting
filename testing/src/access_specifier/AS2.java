package access_specifier;

public class AS2 {

	public static void main(String[] args) {
		AS1 a2=new AS1();
		a2.test1();
		a2.test2();
		a2.test3();
		System.out.println("call defau member of AS1 "+a2.a);
        System.out.println("call pub mem of AS1"+a2.b);
	    System.out.println("call protected member of AS1"+a2.d);
	}

}
