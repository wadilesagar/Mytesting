package Interface;

public class J  implements J1,J2 {

	public static void main(String[] args) {
		
J j=new J();
j.bike();
j.cycle();
j.money();
j.nature();
j.rules();
j.study();
	}

	@Override
	public void rules() {
		System.out.println("J2 rules completed in J class");
	}

	@Override
	public void study() {
	System.out.println("J2 studyn copmleted in J class");	
	}

	@Override
	public void nature() {
		System.out.println("j2 nature completed in j class");
		
	}

	@Override
	public void money() {
		System.out.println("j1 money completed in j class");
		
	}

	@Override
	public void bike() {
		System.out.println("j1 bike completed in j class");
	}

	@Override
	public void cycle() {
		System.out.println("J1 cycle completed in J class");
		
	}

}
