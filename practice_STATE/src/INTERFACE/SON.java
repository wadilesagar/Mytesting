package INTERFACE;

public class SON implements FATHER {
	public static void main(String[] args) {
		SON s=new SON();
		s.money();
		s.car();
		s.soncar();
	}

	@Override
	public void money() {
		System.out.println("fathers money");
	}

	@Override
	public void car() {
		System.out.println("fathers car");
	}
	void soncar()

	{
		System.out.println("sons car");
	}
}
