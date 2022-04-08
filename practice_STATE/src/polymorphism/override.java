package polymorphism;

public class override {

	public static void main(String[] args) {
		father f=new father();
		f.car();
		f.money();
		son s=new son();
		s.car();
		s.money();
	}

}
